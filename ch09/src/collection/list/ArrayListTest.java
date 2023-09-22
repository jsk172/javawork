package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		//String 자료형으로 데이터 관리(CRUD)
		List<String> vegeList = new ArrayList<>();
		
		//자료 생성(추가)(Create : add())
		vegeList.add("양파"); //0번 인덱스에 저장
		vegeList.add("마늘"); //1번 인덱스에 저장
		vegeList.add("감자"); //2번 인덱스에 저장
		
		//리스트 객체의 개수
		System.out.println("총 객체수 : " + vegeList.size());
		
		//객체 수정(Update : set())
		vegeList.set(2, "상추"); //감자-->상추
		
		//객체 삭제(Delete : remove())
		if(vegeList.contains("마늘")) { //포함되어있는지 확인
			vegeList.remove("마늘");//포함되어 있으면 삭제 
		}
		vegeList.remove(1); //상추 삭제, 마늘 삭제돼서 인덱스 번호 1번 됨.
		
		System.out.println("총 객체수 : " + vegeList.size()); //삭제후 객체수
		
		//전체조회(Read : get())
		for(int i=0; i<vegeList.size(); i++) {//리스트를 순회하면서
			String vege2 = vegeList.get(i); //객체를 가져와서
			System.out.println(vege2); //출력함.
		}
		System.out.println(vegeList);
	}
}
