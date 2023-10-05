package collection.stack;

public class MyStackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		//객체 저장
		stack.push("a"); //0번 인덱스
		stack.push("b"); //1번 인덱스
		stack.push("c"); //2번 인덱스
		
		//객체 꺼내기
		System.out.println(stack.pop()); //c size(3-1) 2번인덱스 부터 빠짐. = c
		System.out.println(stack.pop()); //b size(2-1) = b
		System.out.println(stack.pop()); //a size(1-1) = a
		System.out.println(stack.pop());
	}
}
