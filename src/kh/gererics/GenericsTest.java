package kh.gererics;

import java.util.ArrayList;
import java.util.Date;

public class GenericsTest {

	public static void main(String[] args) {
		GenericsTest gt = new GenericsTest();
//		gt.beforeGeneric();
//		gt.afterGeneric();
		
		gt.myGenericTest();
	}

	private void myGenericTest() {
		MyGeneric<String> m = new MyGeneric<>();
		m.add("apple");
		m.add("banana");
		m.add("grape");
		
		for (int i = 0; i < m.size(); i++) {
			String s = m.get(i);
			System.out.println(s.toUpperCase());
		}
	}

	private void afterGeneric() {
		ArrayList<String> list = new ArrayList<>();
		list.add(new String("hello"));
		list.add(new String("generics"));
		list.add(new String("hi"));
		list.add(new String("java"));
		
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s.toUpperCase());
		}
		
		// 제너릭 사용시 컴파일 타입 체크가 가능
		// list.addAll(new Date());
		
		// 꺼낼 쓸 경우 형변환 할 필요가 없음
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s.toUpperCase());
		}
		
	}

	private void beforeGeneric() {
		ArrayList list = new ArrayList();
		list.add(new String("Hello"));
		list.add(new Integer(1234));
		list.add(new Date());
		
		// get메소드의 리턴타입
		Object o1 = list.get(0);
		Object o2 = list.get(1);
		Object o3 = list.get(2);
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		
		for (int i = 0; i < list.size(); i++) {
			Object e = list.get(i);
			
			// 문자열이라면
			if(e instanceof String){
				String s = (String) e;
			}
			
			// 숫자하면
			else if (e instanceof Integer) {
				Integer num = (Integer)e;
				System.out.println(num.intValue()*1000);
			}
			// 날짜라면
			else if (e instanceof Date) {
				Date d = (Date)e;
				System.out.println(d.getTime());
			}
		}
		
		
		
	}
	
}
