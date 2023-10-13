package dbcrud;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Boards;

public class BoardsSelectTest {
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
			String sql = "SELECT * FROM boards WHERE bwriter = ? "
					+ "ORDER BY bno DESC";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "cloud");
			
			//sql 실행
			ResultSet rs = pstmt.executeQuery();
			List<Boards> boardList = new ArrayList<>();
			
			while(rs.next()) {
				Boards board = new Boards();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBfileName(rs.getString("bfilename"));
				board.setBfileData(rs.getBlob("bfiledata"));
				boardList.add(board);
				
				//서버 컴퓨터의 하드디스크에 첨부 파일 저장
				Blob blob = board.getBfileData();
				if(blob != null) {
					InputStream is = blob.getBinaryStream();
					OutputStream os = new FileOutputStream("c:/File/" + board.getBfileName());
					/*
					byte[] data = new byte[1024];
					while(true) {
						int num = is.read(data);
						if(num == -1) {
							break;
						}
						os.write(data, 0, num);
					}*/
					is.transferTo(os); //바이너리 파일 쓰기(저장) 매서드
					
					os.flush();
					os.close();
					is.close();
				}
			}
			//boardList 출력
			for(Boards board : boardList) {
				System.out.println(board);
			}
			
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
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
