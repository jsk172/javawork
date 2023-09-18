package arraylist.shape;
//교재 279쪽 5번
import java.util.ArrayList;

class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("Triangle");
	}
}



public class ShapeTest {

	public static void main(String[] args) {
		
		ArrayList<Shape> list = new ArrayList<>();
		
		//list에 객체 저장
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Shape());
		
		//list 출력
		/*
		for(int i=0; i<list.size(); i++) {
			Shape s = list.get(i);
			s.draw();
		}
		*/
		
		//향상 for문
		for(Shape s : list) {
			s.draw();
		}
	}
}