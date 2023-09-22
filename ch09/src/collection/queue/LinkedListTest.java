package collection.queue;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
		//Queue 방식 - 선입선출
		List<String> myList = new LinkedList<>();

		//자료 추가
		myList.add("A"); //0번 인덱스
		myList.add("B"); //1번 인덱스
		myList.add("C"); //2번 인덱스

		//객체 출력
		System.out.println(myList);

		//특정 위치에 자료추가
		myList.add(2, "D");
		System.out.println(myList);

		//전체 요소 출력
		for(String list : myList) {
			System.out.print(list + " ");
		}
	}
}
