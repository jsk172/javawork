package datainputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest2 {
	public static void main(String[] args) {
		//close() 사용하지 않는 방법 : try ~ with ~ resource문
		String originFile = "C:/File/harvest1.jpg"; //원본파일
		String copyFile = "C:/File/harvest3.jpg"; //사본파일
		long start, end;
		
		try(InputStream is = new FileInputStream(originFile);
			OutputStream os = new FileOutputStream(copyFile)) {
			start = System.currentTimeMillis(); //복사 전 시간
			
			while(true) {
				int num = is.read(); //읽은 데이터
				if(num == -1) {
					break;
				}
				os.write(num); //파일에 쓰기
			}
			os.flush();
			end = System.currentTimeMillis(); //복사 후 시간
			System.out.println("복사 소요시간 : " + (end-start)+"ms");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
