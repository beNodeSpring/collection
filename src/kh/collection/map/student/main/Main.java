package kh.collection.map.student.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import kh.collection.map.student.model.vo.Student;

public class Main {
	private HashMap<String, Student> stdtMap = new HashMap<>();
	
	public static void main(String[] args) {
		Main m = new Main();
		m.test1();
		m.test2();
	}

	private void test2() {
		
		// 1.keySet : 키의 집합을 만듬 => 맵은 iterable을 상속받지 않아서 iterator을 못쓰므로 키셋을 이용함
		System.out.println("***** keySet을 이용해서 Map을 반복하기 *****");		
		
		Set<String> kSet = stdtMap.keySet();
		Iterator<String> iter = kSet.iterator();
		//
		while(iter.hasNext()) {
			String key = iter.next();
			Student value = stdtMap.get(key);
			System.out.println(key + "=" + value);
		}

		
		// 2.entryset: Map의 내부 인터페이스인 Entry 타입을 이용함
		System.out.println("***** keySet을 이용해서 Map을 반복하기 *****");		
		
		
	}

	private void test1() {
		stdtMap.put("001", new Student("001", "김승태"));
		stdtMap.put("002", new Student("002", "김재겸"));
		stdtMap.put("003", new Student("003", "김태규"));
		
		System.out.println(stdtMap);
		// Map은 key의 중복을 허용하지 않는다 => 오버라이드 됨
		stdtMap.put("001", new Student("001", "서현숙"));
		System.out.println(stdtMap);
		
		// Map은 value의 중복은 허용한다.
		Student s = stdtMap.get("001");
		System.out.println("검색한 학생" + s);
		
		// 삭제
		Student removed = stdtMap.remove("001");
		System.out.println("삭제한 락생" + removed);
		System.out.println(stdtMap);
	}

}
