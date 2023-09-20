package nestedclass;


//지역 내부 클래스
class Outer{
	int outNum = 100;
	static int sNum = 100;
	
	//매서드 - MyRunnable 클래스
	Runnable getRunnable() {
		int num = 10;
		class MyRunnable implements Runnable{
			int localNum = 20;

			@Override
			public void run() {
//				num = 20; //상수로 변환되어 변경 할 수 없음(final이 있음.)
				localNum = 30;
				System.out.println(outNum + "(외부클래스의 맴버(인스턴스) 변수)");
				System.out.println(sNum + "(외부클래스의 정적 변수)");
				System.out.println(localNum + "(내부클래스의 맴버(인스턴스) 변수)");
				System.out.println(num);
			}
			
		}
		/*
		MyRunnable MyRun = new MyRunnable();
		return MyRun; 밑에 return 이랑 같음.
		*/
		
		return new MyRunnable();
	}
	
}


public class LocalInnerClass {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.getRunnable().run();
	}
}
