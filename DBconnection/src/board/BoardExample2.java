package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample2 {
	
		private Scanner scanner = new Scanner(System.in);
		private Connection conn;
		private PreparedStatement pstmt;
		//db연결관련 변수
		private String driverClass = "oracle.jdbc.OracleDriver";
		private String url = "jdbc:oracle:thin:@localhost:1521/xe";
		private String user = "c##mydb";
		private String password = "pwmydb";
		
		//생성자
		public BoardExample2() {
			try {
				Class.forName(driverClass);
				conn = DriverManager.getConnection(url, user, password);
//				System.out.println("DB 연결 성공!" + conn);
			}  catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		
		public void list() {
			System.out.println();
			System.out.println("[게시글 목록]");
			System.out.println("-----------------------------------------------------------------------");
			System.out.printf("%-4s%-12s%-20s%-20s\n", "no", "writer", "date", "title");
			System.out.println("-----------------------------------------------------------------------");
			
			//db - board 테이블의 모든 게시물 가져오기
			try {
				String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM board ORDER BY bno DESC";
				pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) { //게시글이 있는 동안 반복(다음 행으로 이동)
					Board board = new Board();
					board.setBno(rs.getInt("bno"));
					board.setBwriter(rs.getString("bwriter"));
					board.setBdate(rs.getDate("bdate"));
					board.setBtitle(rs.getString("btitle"));
//					board.setBcontent(rs.getString("bcontent"));
					
					//게시글 출력
					System.out.printf("%-4s%-12s%-20s%-18s\n",
							board.getBno(),
							board.getBwriter(),
							board.getBdate(),
							board.getBtitle()
//							board.getBcontent()
					);
				}//while 끝
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				exit();
			}
			mainMenu(); //mainMenu() 매서드 호출
		}
		public void mainMenu() {
			System.out.println("--------------------------------------------");
			System.out.println("1.Create | 2.Read | 3.Clear | 4.Exit |");
			System.out.println("--------------------------------------------");
			System.out.print("선택 : ");
			
			String menuNo = scanner.nextLine();
			
			switch(menuNo) {
			case "1":
				create(); break;
			case "2":
				read(); break;
			case "3":
				clear(); break;
			case "4":
				exit(); break;
			}
		}
		//create
		public void create() {
//			System.out.println("create() 매서드 실행됨.");
			Board board = new Board();
			System.out.println("[새 게시물 입력]");
			
			System.out.print("제목 : ");
			String title = scanner.nextLine();
			board.setBtitle(title);
			
			System.out.print("내용 : ");
			String content = scanner.nextLine();
			board.setBcontent(content);
			
			System.out.print("작성자 : ");
			String writer = scanner.nextLine();
			board.setBwriter(writer);
			
			//db작업 - insert
			try {
				String sql = "INSERT INTO board(bno, btitle, bcontent, bwriter) "
						+ "VALUES(seq.NEXTVAL, ?, ?, ?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, board.getBtitle()); //콘솔에서 입력한 제목을 db에 저장
				pstmt.setString(2, board.getBcontent());
				pstmt.setString(3, board.getBwriter());
				//sql 실행
				pstmt.executeUpdate();
				
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				exit(); //종료 매서드 호출
			}
			//목록 매서드 호출
			list();
		}
		//read
		public void read() {
//			System.out.println("read() 매서드 실행됨.");
			System.out.println("[게시물 읽기]");
			System.out.print("글번호 입력 : ");
			int bno = Integer.parseInt(scanner.nextLine());
			
			//db 작업 - select ~ where 절
			try {
				String sql = "SELECT * FROM board WHERE bno = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, bno);
				//쿼리 실행
				ResultSet rs = pstmt.executeQuery();
				if(rs.next()) { //찾은 자료가 있으면
					Board board = new Board();
					//db의 값을 가져와서 board에 세팅
					board.setBno(rs.getInt("bno"));
					board.setBwriter(rs.getString("bwriter"));
					board.setBdate(rs.getDate("bdate"));
					board.setBtitle(rs.getString("btitle"));
					board.setBcontent(rs.getString("bcontent"));
					
					//콘솔에 출력
					System.out.println("*************************************************");
					System.out.println("번호 : " + board.getBno());
					System.out.println("제목 : " + board.getBtitle());
					System.out.println("내용 : " + board.getBcontent());
					System.out.println("작성자 : " + board.getBwriter());
					System.out.println("작성일 : " + board.getBdate());
					System.out.println("*************************************************");
					
					//수정, 삭제 메뉴 만들기
					System.out.println("1.글수정 | 2.글삭제 | 3.글목록");
					System.out.print("선택 : ");
					String menuNo = scanner.nextLine();
					
					if(menuNo.equals("1")) {
						update(board);
					}else if(menuNo.equals("2")) {
						delete(board);
					}
					
				}// if끝
			} catch (SQLException e) {
				e.printStackTrace();
				exit();
			}
			
			list();
		}//read
		//update
		public void update(Board board) { //이미 작성된 글(board) 가져와서 수정
			System.out.println("[수정할 내용 입력]");
			System.out.print("제목 : ");
			String title = scanner.nextLine();
			board.setBtitle(title);
			
			System.out.print("내용 : ");
			String content = scanner.nextLine();
			board.setBcontent(content);
			
			System.out.print("작성자 : ");
			String writer = scanner.nextLine();
			board.setBwriter(writer);
			
			//db작업 - update
			try {
				String sql = "UPDATE board SET btitle = ?, bcontent = ?, bwriter = ? "
						+ "WHERE bno = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, board.getBtitle());
				pstmt.setString(2, board.getBcontent());
				pstmt.setString(3, board.getBwriter());
				pstmt.setInt(4, board.getBno());
				//sql실행
				pstmt.executeUpdate();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				exit();
			}
		}
		//delete
		public void delete(Board board) {
			//확인, 취소 메뉴
			System.out.println("정말 삭제하시겠습니까?");
			System.out.println("1.Yes | 2.No");
			System.out.print("선택 : ");
			
			String menuNo = scanner.nextLine();
			if(menuNo.equals("1")) {
				//db작업 - DELETE
				try {
					String sql = "DELETE FROM board WHERE bno = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, board.getBno());
					//sql 실행
					pstmt.executeUpdate();
					System.out.println("삭제 되었습니다.");
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					exit();
				}
			}
			
		}
		//clear - 테이블은 유지하면서 전체 글 삭제(sql : TRUNCATE TABLE board;)
		public void clear() {
//			System.out.println("clear() 매서드 실행됨.");
			System.out.println("[전체 게시글 삭제]");
			System.out.println("=========================================");
			//확인, 취소 메뉴
			System.out.println("정말 삭제하시겠습니까?");
			System.out.println("1.Yes | 2.No");
			System.out.print("선택 : ");
			
			String menuNo = scanner.nextLine();
			if(menuNo.equals("1")) {
				//db작업 - TRUNCATE
				try {
					String sql = "TRUNCATE TABLE board";
					pstmt = conn.prepareStatement(sql);
					//sql 실행
					pstmt.executeUpdate();
					System.out.println("삭제 되었습니다.");
					//글번호가 삭제후에 이어진 번호 출력되는 문제 발생(1번으로 초기화)
					sql = "DROP SEQUENCE seq";
					pstmt = conn.prepareStatement(sql);
					pstmt.executeUpdate();
					
					sql = "CREATE SEQUENCE seq NOCACHE";
					pstmt = conn.prepareStatement(sql);
					pstmt.executeUpdate();
					
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					exit();
				}
			}
			list();
		}
		//exit
		public void exit() { //호출되면 DB 연결 종료
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			System.out.println("******* 게시판을 종료합니다. *******");
			System.exit(0); //즉시종료
		}
		
		
		public static void main(String[] args) {
			BoardExample2 board1 = new BoardExample2();
			board1.list();
		}//main
}
