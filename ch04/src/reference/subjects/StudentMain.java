package reference.subjects;

public class StudentMain {
	public static void main(String[] args) {
		/*
		Student std1 = new Student(101, "홍길동");
		Student std2 = new Student(102, "김지성");
		
		//과목 추가
		std1.koreanSubject("국어", 90);
		std1.mathSubject("수학", 100);
		
		std2.koreanSubject("국어", 90);
		std2.mathSubject("수학", 100);
		
		//학생정보 출력
		std1.showStudentInfo();
		System.out.println("");
		
		std2.showStudentInfo();
		*/
		
		//객체 배열
		Student[] students = {
				new Student(101, "홍길동"),
				new Student(102, "임꺽정"),
				new Student(103, "임상욱")
		};
		//점수 저장
		students[0].koreanSubject("국어", 95);
		students[0].mathSubject("수학", 90);
		
		students[1].koreanSubject("국어", 100);
		students[1].mathSubject("수학", 80);
		
		students[2].koreanSubject("국어", 97);
		students[2].mathSubject("수학", 100);
		
		//전체 출력
		for(int i = 0; i<students.length; i++) {
			students[i].showStudentInfo();
			System.out.println("");
		}
		System.out.println("=========================================");
		
		//향상 for
		for(Student std : students) {
			std.showStudentInfo();
		}
		
	}
}
