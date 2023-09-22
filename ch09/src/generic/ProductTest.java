package generic;

public class ProductTest {
	public static void main(String[] args) {
		//Product 객체 생성<클래스, 문자열>
		Product<TV, String> prod1 = new Product<>();
		
		//TV 객체 생성
		TV tv = new TV();
		
		prod1.setKind(tv);
		prod1.setModel("스마트TV");
		
		tv.making();
		System.out.println("모델명 : " + prod1.getModel());
		
		System.out.println("===========================");
		//자동차를 생성해서 모델명을 출력하세요.
		Product<Car, String> prod2 = new Product<>();
		Car car = new Car();
		
		prod2.setKind(car);
		prod2.setModel("전기차");
		
		car.making();
		System.out.println("모델명 : " + prod2.getModel());
	}
}
