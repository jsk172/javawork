package customers;

public class CustomerTest1 {
	public static void main(String[] args) {
		//일반 고객 1명, vip 고객 1명의 객체 생성
		Customer lee = new Customer();
		//입력
		lee.setCustomerId(1001);
		lee.setCustomerName("이순재");
		
		int price = 10000; //구매 가격
		lee.calcPrice(10000);
		
		//출력
		System.out.println(lee.showCustomerInfo());
		System.out.println("=====================================");
		
		VIPCustomer woo = new VIPCustomer();
		woo.setCustomerId(1010);
		woo.setCustomerName("우영우");
		woo.setAgendId(7777);
		
		price = 20000;
		woo.calcPrice(price);
		
		System.out.println(woo.showCustomerInfo());
	}
}
