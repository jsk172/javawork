package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		//학생의 이름과 점수를 저장 할 HashMap 객체 생성
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("이순신", 95); //key, value
		map.put("양만춘", 87);
		map.put("강감찬", 75);
		map.put("이순신", 85);
		
		//특정 객체 조회(key-->value)
		System.out.println(map.get("양만춘"));
		
		//객체 삭제
		if(map.containsKey("강감찬")) { //객체가 map안에 포함됐다면
			map.remove("강감찬"); //key를 삭제하면 -> value도 삭제
		}
		
		//총 객체수
		System.out.println("총 객체 수 : " + map.size());
		
		//전체 조회
		Set<String> keySet = map.keySet(); //key값 객체를 생성
		Iterator<String> ir = keySet.iterator(); //key값으로 반복할 반복자 객체 생성
		while(ir.hasNext()) {//객체 수만큼 반복
			String key = ir.next(); //객체가 있으면 1개씩 가져옴
			Integer val = map.get(key); //key를 매개로 값을 가져옴
			System.out.println(key + ", " + val);
		}
		System.out.println("=====================");
		
		//전체 조회2
		for(String key : keySet) {
			System.out.println(key + ", " + map.get(key));
		}
		
		//객체 자체를 출력
		System.out.println(map);
	}
}
