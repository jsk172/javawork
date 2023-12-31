package inheritance.statement;

public class Drink {
	//protected 접근제어자는 상속 할때만 사용
	protected String name; //상품명
	protected int price; //가격
	protected int count; //수량
	
	public Drink(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	public int getTotalPrice() {
		return price * count; // 금액 = 가격 x 수량
	}
	
	public static void printTitle() { //제목 출력 , 매서드 재정의
		System.out.println("상품명\t가격\t수량\t금액");
	}
	
	public void printData() {
		System.out.println(name + "\t" + price + "\t" + count + "\t" + getTotalPrice());
	}

	
	
	
	
	
}