package singleton.student;

public class Student {
	private static int serialNum = 0;
	private int studentNum;
	
	public Student() {
		serialNum++;
		studentNum = serialNum;
	}
	
	public int getStudentNum() {
		return studentNum;
	}

}
