package funcinterface.lambdaint;

public class MyNumber2Test {
	public static void main(String[] args) {
		MyNumber2 myNum;
		
		//getMax()구현
		/*
		myNum = (x, y) -> {
			return x >= y ? x : y;
		};*/
		
		//return 생략가능함
		myNum = (x,y) -> (x>=y) ? x:y;
		
		//getMax()호출
		System.out.println("더 큰 수는 : " + myNum.getMax(20, 10));
	}
}
