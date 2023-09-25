package threads.join;

public class SumThread extends Thread{
	
	private long sum;
	
	public long getSum(){
		return sum;
	}
	
	//Thread는 run()을 구현 해야 함.
	@Override
	public void run() {
		for(int i=0; i<=100; i++) {
			sum += i;
		}
	}
	
}
