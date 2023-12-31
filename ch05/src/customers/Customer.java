package customers;

//상속을 위해 필드의 접근제어자-protected
//접근제어자가 생략된 필드는 default
public class Customer {
	protected int customerID; // 고객 아이디
	protected String customerName; // 고객 이름
	protected String customerGrade; //고객 등급
	int bonusPoint; //보너스 포인트
	double bonusRatio; //보너스 적립율
	
	public Customer() {
		customerGrade = "Silver"; // 기본등급
		bonusRatio = 0.01; // 기본 적립율(1%)
	}
	
	public Customer(int customerId, String customerName) {
		this.customerID = customerId;
		this.customerName = customerName;
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	public void setCustomerId(int customerId) {
		this.customerID = customerId;
	}
	public int getCustomerId() {
		return customerID;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerName() {
		return customerName;
	}
	
	//보너스 포인트 = 가격 x 보너스적립율
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
	
	//정보 출력 매서드
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + 
				"이고, 보너스 포인트는 " + bonusPoint + "점 입니다.";
	}

}
