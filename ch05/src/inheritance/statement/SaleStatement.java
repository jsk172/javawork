package inheritance.statement;

public class SaleStatement {
	public static void main(String[] args) {
		//Drink 클래스 사용
		Drink coffee = new Drink("커피", 2500, 10);
		Drink greentea = new Drink("녹차", 3000, 4);

		
		//Alcohol 클래스 사용
		Alcohol 소주 = new Alcohol("소주", 4000, 3, 15.1f);
		Alcohol 맥주 = new Alcohol("맥주", 5000, 3, 3.5f);
		
		//전표 출력
		Drink.printTitle();
		coffee.printData();
		greentea.printData();
		
		System.out.println("=================================================");
		//Alcohol 전표 출력
		Alcohol.printTitle();
		소주.printData();
		맥주.printData();
		
		//총계 출력
		int sumVal = coffee.getTotalPrice()+greentea.getTotalPrice()+소주.getTotalPrice()+맥주.getTotalPrice();
		System.out.println("\n******** 합계 금액 ********\t:\t" + sumVal + "원");
	}
}
