package statics.card;

public class Card {
	private static int serialNum = 10000; //클래스 변수
	private int cardNumber; //인스턴스 변수
	
	
	public Card() {//생성 할 떄 마다 카드번호가 1 증가됨
		serialNum++;
		cardNumber = serialNum;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
}