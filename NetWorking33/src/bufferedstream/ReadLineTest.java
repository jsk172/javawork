package bufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class ReadLineTest {
	public static void main(String[] args) {
		//FileReader에 BufferedReader 보조 스트림 연결
		try (BufferedReader br = new BufferedReader(
				new FileReader("word.txt"))){
			//전체 데이터 읽기
			String data;
			String[] word = null;
			while((data = br.readLine()) != null) {
//				System.out.println(data);
				word = data.split(" ");
			}
			System.out.println(Arrays.toString(word));
			
			//랜덤 출력
//			int dice = (int)(Math.random()*6 + 1);
//			System.out.println(dice);
//			System.out.println(word.length);
			
			int rnd = (int)(Math.random()*word.length);
			System.out.println(rnd);
			System.out.println(word[rnd]);
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
