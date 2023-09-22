package collection.set;

public class Student {
	String name;
	int id;
	
	public Student(String name, int id){
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return name + ":" + id;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(name.equals(student.name));
			return true;
		}
		return false;
	}
	
}
