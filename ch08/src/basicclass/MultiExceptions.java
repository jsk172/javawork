package basicclass;

public class MultiExceptions {
	public static void main(String[] args) {
		//문자열을 숫자로 변환 - NumberFormatException
		//인덱스 범위 에러 - ArrayIndexOutOfBoundsException
		String[] array = {"100", "123a"};

		for(int i=0; i<=array.length; i++) {
			try {
//				System.out.println(array[i]);
				int val = Integer.parseInt(array[i]);
				System.out.println(val);
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환 할 수 없는 항목이 있습니다.");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 범위를 초과했습니다.");
			}
		}
	}
}
