package nestedclass;

class Out{
	int outNum = 100;
	static int sNum = 200;
	
	//클래스 이름을 사용하지 않은 익명(이름없는) 클래스
	Runnable runner = new Runnable() {
		int localNum = 20;
		@Override
		public void run() {
			System.out.println(outNum + "(외부클래스의 맴버(인스턴스) 변수)");
			System.out.println(sNum + "(외부클래스의 정적 변수)");
			System.out.println(localNum + "(내부클래스의 맴버(인스턴스) 변수)");
		}
	};
}



public class LocalInnerClass2 {
	public static void main(String[] args) {
		Out out = new Out();
		out.runner.run();
	}
}
