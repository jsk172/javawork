package reference.subjects2;

public class StudentTest {
	public static void main(String[] args) {
		Student kim = new Student(101, "김대한");
		Student park = new Student(102, "박민국");
		
		kim.addSubject("국어", 90);
		kim.addSubject("수학", 85);
		kim.addSubject("과학", 78);
		kim.addSubject("사회", 79);
		
		
		kim.addSubject("코딩", 90);
		kim.addSubject("Java", 88);
		
		kim.showStudentInfo();
		park.showStudentInfo();
	}
}
