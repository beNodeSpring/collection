package kh.collection.list.student.run;

import java.util.ArrayList;
import java.util.List;

import kh.collection.list.student.impl.StudentList;
import kh.collection.list.student.model.compare.DescJava;
import kh.collection.list.student.model.vo.Student;

public class StudentTest {

	public static void main(String[] args) {
		new StudentTest().arrayTest();
		//new StudentTest().collectionTest();
	}

	private void collectionTest() {
		ArrayList<Student> stdtList = new ArrayList<>();
		stdtList.add(new Student("김승태", 90));
		stdtList.add(new Student("서현숙", 85));
		stdtList.add(new Student("김태규", 91));
		stdtList.add(new Student("서진", 80));
		stdtList.add(new Student("김재겸", 60));
		stdtList.add(new Student("아이린", 100));
		
		printStdtList(stdtList);
		stdtList.add(1, new Student("김도현", 98));
		System.out.println("--------------------------------");
		System.out.println("collectionTest() 중간에 요소추가 - 김도현을 1번째로 추가");
		printStdtList(stdtList);	
		
		// 검색
		// 해당학생이 존재하면 인덱스를 리턴
		Student search = new Student("김재겸", 0);
		int index = stdtList.indexOf(search);
		if(index > -1){
			System.out.println("********검색결과********");
			System.out.println(stdtList.get(index));
		} else {
			System.out.println("해당 학생이 존재하지 않습니다");
		}		
	}

	private void arrayTest() {
		StudentList stdtList  = new StudentList();
		stdtList.add(new Student("김승태", 90));
		stdtList.add(new Student("서현숙", 85));
		stdtList.add(new Student("김태규", 91));
		stdtList.add(new Student("서진", 80));
		stdtList.add(new Student("김재겸", 60));
		stdtList.add(new Student("아이린", 100));
		
		printStdtList(stdtList);

		stdtList.add(1, new Student("김도현", 98));
		System.out.println("--------------------------------");
		System.out.println("arrayTest() 중간에 요소추가 - 김도현을 1번째로 추가");
		printStdtList(stdtList);
		
		// 실습문제 : 요소 삭제하기
		Student s = stdtList.remove(3);
		System.out.println(s.getName() + " 학생을 삭제했습니다");
		printStdtList(stdtList);
		
		// 검색
		// 해당학생이 존재하면 인덱스를 리턴
		Student search = new Student("김재겸", 0);
		int index = stdtList.indexOf(search);
		if(index > -1){
			System.out.println("********검색결과********");
			System.out.println(stdtList.get(index));
		} else {
			System.out.println("해당 학생이 존재하지 않습니다");
		}
		
		// 정렬
		// 자바점수로 내림차순 정렬
		stdtList.sort(new DescJava());
		printStdtList(stdtList);
	}

	private void printStdtList(StudentList stdtlist) {
		System.out.println("이름\t자바점수");
		System.out.println("---------------------");
		for (int i = 0; i < stdtlist.size(); i++) {
			System.out.println(stdtlist.get(i));
		}
	}
	
	private void printStdtList(List<Student> stdtlist) {
		System.out.println("이름\t자바점수");
		System.out.println("---------------------");
		for (int i = 0; i < stdtlist.size(); i++) {
			System.out.println(stdtlist.get(i));
		}
	}

}
