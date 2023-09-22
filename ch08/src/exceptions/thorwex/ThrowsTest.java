package exceptions.thorwex;

public class ThrowsTest {
	public static void main(String[] args) {
		//함수를 호출한 곳에서 예외 처리
		try {
			findClass();
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println(e.toString());
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		//컴파일러가 체크해줌 - 일반 예외
		//throw는 예외를 미뤄둠.
		Class.forName("java.lang.System2");
	}
}
