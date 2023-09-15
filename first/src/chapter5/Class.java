package chapter5;

public class Class {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showClassInfor() {
		System.out.println(studentName + "," + address);
	}
	
	public static void main(String[] args) {
		
		Class studentLee = new Class();
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 서초구 서초동";
		
		studentLee.showClassInfor();
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
}


