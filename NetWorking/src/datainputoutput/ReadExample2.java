package datainputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/File/test2.db");

			byte[] data = new byte[1024]; //데이터를 읽을 배열 생성

			while(true) {
				int num = is.read(data); //배열을 읽은 바이트 값.
				
				if(num == -1) {
					break;
				}
				for(int i =0; i<num; i++) {
					System.out.println(data[i]);
				}
			}
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
