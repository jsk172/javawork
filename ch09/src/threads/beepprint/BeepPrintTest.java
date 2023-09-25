package threads.beepprint;

import java.awt.Toolkit;

public class BeepPrintTest {
	public static void main(String[] args) {
		//싱글 스레드 - 메인 스레드만 설정
		//"띵" 문자를 5번 출력
		//1초 간격 - 대기 시간
		//Thread.sleep(밀리세컨드); - 대기시간
		//소리 발생 - Toolkit의 beep()
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//"띵" 소리를 5번 재생하기
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
