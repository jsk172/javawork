package singleton.student;

public class StudentMain {
	public static void main(String[] args) {
		School school1 = School.getInstance();
		School school2 = School.getInstance();
		
		Student std1 = school1.createStudent();
		Student std2 = school1.createStudent();
		Student std3 = school1.createStudent();
		
		System.out.println("학생 번호 : " + std1.getStudentNum());
		System.out.println("학생 번호 : " + std2.getStudentNum());
		System.out.println("학생 번호 : " + std3.getStudentNum());
		
		System.out.println(school1);
		System.out.println(school2);
		
		System.out.println(std1);
		System.out.println(std2);
		System.out.println(std3);
	}
}
