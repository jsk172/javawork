package arraylist.score;

public class Main {
	public static void main(String[] args) {
		Student std1 = new Student(101,"우영우");
		
		std1.addSubject("국어", 90);
		std1.addSubject("수학", 100);
		std1.addSubject("Java", 88);
		
		std1.showStudentInfo();
	}
}
