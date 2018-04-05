package com.collection.set.student.model.vo;

public class Student {
	private String stdtId;
	private String stdtName;
	
	public Student(){}
	public Student(String stdtId, String stdtName) {
		this.stdtId = stdtId;
		this.stdtName = stdtName;
	}
	
	public String getStdtId() {
		return stdtId;
	}
	public void setStdtId(String stdtId) {
		this.stdtId = stdtId;
	}
	public String getStdtName() {
		return stdtName;
	}
	public void setStdtName(String stdtName) {
		this.stdtName = stdtName;
	}
	
	@Override
	public String toString() {
		return "[("+stdtId + ") " + stdtName +"]";
	}
	@Override
	public boolean equals(Object obj) {
		Student other = (Student)obj;
		if(this.stdtId.equals(other.getStdtId())){
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return 31+stdtId.hashCode();
	}
	
	
	
}
