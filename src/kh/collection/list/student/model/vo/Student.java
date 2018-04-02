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
	
}
