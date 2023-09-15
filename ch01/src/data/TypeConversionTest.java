package data;

public class TypeConversionTest {
	public static void main(String[] args) {
		// 형 변환 - 1. 자동 형변환
		int iNum = 20;
		float fNum = iNum; // 실수형(4byte) = 정수형(4byte)
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum; // 실수형 8byte
		dNum = iNum + fNum;
		System.out.println(dNum);
		
		// 2. 강제 형변환
		double dNum1 = 1.2;
		float fNum2 = 0.9f;
		
		int iNum2 = (int)dNum1 + (int)fNum2;
		int iNum3 = (int)(dNum1 + fNum2);
		
		System.out.println(iNum2);
		System.out.println(iNum3);
		
		
	}
}
