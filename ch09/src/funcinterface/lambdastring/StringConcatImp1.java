package funcinterface.lambdastring;

//StringConcat 인터페이스를 구현한 StringConcatImp1 클래스
public class StringConcatImp1 implements StringConcat{

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + " " + s2);
	}
	
}
