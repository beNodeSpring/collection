package kh.collection.list.student.model.vo;

public class Student {
	private String name;
	private int java;
	public Student() {}
	public Student(String name, int java) {
		super();
		this.name = name;
		this.java = java;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	@Override
	public String toString() {
		return name + "\t"+ java;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	/*	public boolean equals(Object obj) {
	@Override
		// 학생명을 검사해서 같다면 true 리턴
		Student other = (Student) obj;
		// 필드비교
		if(name.equals(other.getName())){
			return true;
		}
		return false;
	}*/
	
}
