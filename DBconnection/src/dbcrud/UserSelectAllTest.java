package dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.User;

public class UserSelectAllTest {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null; //sql 처리 인터페이스
		//JDBC 드라이버 등록
		try {
			Class.forName("oracle.jdbc.OracleDriver");

			//연결하기 - getConnection(url, user, password)
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "c##mydb", "pwmydb");
			System.out.println("연결 성공");
			
			//db처리 작업
			//매개 변수화된 sql문 작성 - 동적 바인딩
			String sql = "SELECT * FROM users";
			pstmt = conn.prepareStatement(sql);
			
			//sql 실행 - 검색
			ResultSet rs = pstmt.executeQuery();
			List<User> userList = new ArrayList<>();
			while(rs.next()) {//검색한 데이터가 있으면(찾았으면) DB에서 userid를 꺼내옴
				User user = new User();
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
				
				//list에 객체 저장
				userList.add(user);
			}
				for(int i=0; i<userList.size(); i++) {
					User user = userList.get(i);
					System.out.println(user.toString());
				}
				
			//스텍구조이므로 종료순서를 rs -> pstmt -> conn으로 함
			rs.close();
			pstmt.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결 종료");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
