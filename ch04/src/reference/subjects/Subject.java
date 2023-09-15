package reference.subjects;

public class Subject {
	private String subjectName; // 과목 이름
	private int scorePoint; // 과목 점수
	
	public Subject() {
	}
	
	public Subject(String subjectName, int scorePoint) {
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}
	
	//getter, setter
	//과목 이름 입력
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	//과목 이름 출력
	public String getSubjectName() {
		return subjectName;
	}
	
	//점수 입력
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
	//점수 출력
	public int getScorePoint() {
		return scorePoint;
	}
}
