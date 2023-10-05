package jsondata;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonEx {
	public static void main(String[] args) {
		//JSON 객체 만들기(생성)
		JSONObject member = new JSONObject();
		
		//속성 및 속성값(문자열, 숫자, 객체) 추가
		member.put("id", "sky123");
		member.put("name", "이하늘");
		member.put("age", 28);
		
		//객체 속성 추가
		JSONObject tel = new JSONObject();
		tel.put("home", "02-123-4567");
		tel.put("mobile", "010-1111-2222");
		member.put("tel", tel);
		
		//배열 속성 추가
		JSONArray skill = new JSONArray();
		skill.put("java");
		skill.put("C");
		skill.put("C++");
		member.put("skill", skill); //맴버 객체에 배열 추가
		
		
//		문자열 출력
		String json = member.toString();
		System.out.println(json);
		
//		member객체 출력
//		System.out.println(member);
		
		//파일에 쓰기
		try {
			Writer writer = new FileWriter("C:/File/member.json");
					Charset.forName("UTF-8");
			writer.write(json); //json데이터를 문자열로 쓰기
			writer.flush();
			writer.close();
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
