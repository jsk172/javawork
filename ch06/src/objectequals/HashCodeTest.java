package objectequals;

class Employee{
	int empId;
	String empName;
	
	Employee(int empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
	
	
	//equals 매서드 재정의
	@Override
	public boolean equals(Object obj) {
		//논리적으로 문자열이 동일하도록 구현
		if(obj instanceof Employee) { //obj가 Employee의 instance라면 
			Employee employee = (Employee)obj; //다운 캐스팅(강제 형변환)
			if(this.empId == employee.empId) //외부에서 입력한 사번과 원래 사번이 일치한다면
				return true;
		}
		return false;
	}


	@Override
	public int hashCode() { //int형인 empId를 반환함.
		return empId;
	}
	
}

public class HashCodeTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "정그레");
		Employee emp2 = new Employee(101, "정그레");
		
		System.out.println(emp1 == emp2); //false
		System.out.println(emp1.equals(emp2)); //equals 재정의하면 true
		
		
		//hashcode값 비교 - 동등 객체인지 확인(문자열의 일치 확인)
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		//실제 물리 주소 비교
		System.out.println(System.identityHashCode(emp1));
		System.out.println(System.identityHashCode(emp2));
		
		
		
		
		
		
	}
}
