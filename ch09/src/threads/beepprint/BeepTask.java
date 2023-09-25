package threads.beepprint;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
	//Runnable 인터페이스에는 run() 매서드가 있고
	//구현할 때 재정의 해야 함
	//소리를 발생하는 작업 스레드 구현
	@Override
	public void run() {
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
