package reference.subjects2;

import reference.subjects.Subject;

public class Student {
	//필드
	private int studentId; //int studentId = 0;
	private String studentName; //String studentName = null;
	private Subject[] subjects; 
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjects = new Subject[10]; //과목을 저장할 배열의 크기 10개 생성
	}
	
	//과목 추가
	public void addSubject(String name, int score) {
		//과목 객체를 생성해서 값(과목이름, 점수)을 저장
		Subject subject = new Subject(name, score);
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		
		//과목을 배열에 저장
		for(int i = 0; i<subjects.length; i++) {
			if(subjects[i] == null) {//배열의 요소가 비어있을때
				subjects[i] = subject;//배열 객체를 저장
				break;
			}
		}
	}
	
	//학생 정보 출력
	public void showStudentInfo() {
		int total = 0; // 총점
		double average; //평균
		int count = 0; //과목수
		for(int i = 0; i<subjects.length; i++) {
			if(subjects[i] != null) {//배열의 요소가 비어있지 않을때
				Subject subject = subjects[i]; //객체를 생성하고 출력
				count++; //과목수 증가
				total += subjects[i].getScorePoint();

				System.out.println("학생 "+ studentName + "의 " +subject.getSubjectName()+"점수는 "+ subject.getScorePoint() + "점 입니다.");
			}
		}
		average = (double)total / count;
		System.out.printf("총점은 : %d점입니다.\n평균은 : %.1f점 입니다.", total, average);
	}
	
}
