package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample1 {
	
		Scanner scanner = new Scanner(System.in);
		Connection conn;
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "c##mydb";
		String password = "pwmydb";
		
		//생성자
		public BoardExample1() {
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
			System.out.println("---------------------------------------------------------------------");
			System.out.printf("%-4s%-12s%-12s%-40s\n", "no", "writer", "date", "title");
			System.out.println("---------------------------------------------------------------------");
			System.out.printf("%-4s%-12s%-12s%-40s\n", "1", "today12", "2023-10-17", "가입인사 드립니다.");
			
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
			System.out.println("create() 매서드 실행됨.");
			list();
		}
		//read
		public void read() {
			System.out.println("read() 매서드 실행됨.");
			list();
		}
		//clear
		public void clear() {
			System.out.println("clear() 매서드 실행됨.");
			list();
		}
		//exit
		public void exit() {
			System.out.println("******* 게시판을 종료합니다. *******");
			System.exit(0); //즉시종료
		}
		
		
		public static void main(String[] args) {
			BoardExample1 board1 = new BoardExample1();
			board1.list();
		}//main
}
