package hiding.accounts;

public class AccountTest2 {
	public static void main(String[] args) {
		Account account = new Account("111-222-3333", "김대박", 10000);
		
		//계좌번호 출력
		System.out.println("계좌번호 : " + account.getAno());
		System.out.println("게좌주 : " + account.getOwner());
		System.out.println("잔고 : " + account.getBalance());
	}
}
