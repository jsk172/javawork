package datareaderwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample1 {
	public static void main(String[] args) {
		try (Writer writer = new FileWriter("c:/File/test.txt")){
			
			//1.한 문자 쓰기
			char a = 'A';
			char b = 'B';

			//2. 문자열 쓰기
			String str = "안녕하세요";

			//3. 배열 쓰기
			char[] arr = {'C', 'D', 'E'};
			
			
			writer.write(a); //A
			writer.write(b); //B
			writer.write(arr); //C D E
			writer.write(str); //안 녕 하 세 요
			
			writer.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
