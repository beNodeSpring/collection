package kh.collection.list.student.model.compare;

import java.util.Comparator;

import kh.collection.list.student.model.vo.Student;

public class DescJava implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getJava() - o1.getJava();
	}

}
