package com.collection.set.student.run;

import java.util.HashSet;
import java.util.Set;

import com.collection.set.student.model.vo.Student;

public class Run {
	private HashSet<Student> stdtSet = new HashSet<>();
	
	public static void main(String[] args) {
		Run r = new Run();
		r.stdtTest();
	}

	private void stdtTest() {
		// 학생 관리
		stdtSet.add(new Student("1","김재겸"));
		stdtSet.add(new Student("2","김승태"));
		stdtSet.add(new Student("3","김태규"));
		System.out.println(stdtSet);
		
		// 
		stdtSet.add(new Student("1","김재겸"));
		System.out.println(stdtSet);
		
		System.out.println("1".hashCode());
		System.out.println(new Student("1","김재겸").hashCode());
	}

	private void test() {
		Set<Integer> set = new HashSet<>();
		set.add(new Integer(10));
		set.add(20); // WrapperClass : autoBoxing
		set.add(30);
		
		System.out.println(set); // [20, 10, 30]
		set.add(10); // set은 중복을 허용하지 않으므로 추가 불가
		System.out.println(set); // [20, 10, 30]
	}
	
}
