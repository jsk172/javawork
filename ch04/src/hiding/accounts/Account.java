package hiding.accounts;

//은행 통장 계좌 자료형 생성
public class Account {
	private String ano; //계좌 번호
	private String owner; //계좌주
	private int balance; //잔고
	
	/*
	 * get(), set() 매서드 생성
	 * 만드는 방법 : set,get필드이름() - 필드이름 첫글자 대문자
	 */
	public void setAno(String a) {//매개변수로 계좌번호 전달
		ano = a;
	}
	//기본생성자
	public Account() {
	}
	
	//매개변수 있는 생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setOwner(String own) {
		owner = own;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setBalance(int b) {
		balance = b;
	}
	
	public int getBalance() {
		return balance;
	}

}
