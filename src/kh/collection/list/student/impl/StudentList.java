package kh.collection.list.student.impl;

import java.util.Arrays;

import kh.collection.list.student.model.compare.DescJava;
import kh.collection.list.student.model.vo.Student;

public class StudentList {
	private int size = 0; // 인덱스 및 현재 저장된 요소의 수를 관리
	private Student[] elementData = new Student[3];
	
	// 요소를 추가하는 메소드
	public boolean add(Student s) {
		elementData[size++] = s;
		ensureCapacity();
		return true;
	}

	private void ensureCapacity() {
		// 현재 배열의 size(인덱스)와 elementData의 length를 비교
		if(size==elementData.length) {
			Student[] newElementData = new Student[size*2];
			
			// arraycopy(타겟배열, 시작인덱스, 결과배열, int destPos, int length)
			System.arraycopy(elementData, 0, newElementData, 0, size);
			
			elementData = newElementData;
			System.out.println("배열 크기가 "+elementData.length + "로 증가했습니다.");
		}
	}

	// length로 가져오면 빈배열도 갯수에 포함되므로 사이즈로 가져옴!
	public int size() {
		return size;
	}

	public Student get(int index) {
		return elementData[index];
	}

	public void add(int index, Student student) {
		//ensureCapacity();
		
		// 밀어내기
		for (int i = size-1; i >= index; i--) {
			elementData[i+1] = elementData[i];
		}
		
		// 해당인덱스에 값끼워넣기
		elementData[index] = student;
		
		// size를 증가시킴
		size++;
	}

	public Student remove(int index) {
		Student removed = elementData[index];
		// 밀어내기
		for (int i = index; i < size-1; i++) {
			elementData[i] = elementData[i+1];
		}
		
		size--;
		return removed;
	}

	public int indexOf(Student search) {
		for (int i = 0; i < size; i++) {
			if(elementData[i].equals(search)){
				return i;
			}
		}
		return -1;
	}

	public void sort(DescJava descJava) {
		// null인 요소는 비교의 대상이 될 수 없다.
		// compare메서드중 NullPointerException 유발함
		// 현재 크기의 size를 배열크기로 하는 새로운 Student 객체 생성
		Student[] arr = new Student[size];
		// 기존 데이터를 새로운 A에 복사함
		System.arraycopy(elementData, 0, arr, 0, size);
		
		// 배열을 정렬함
		Arrays.sort(arr, descJava);
		for (int i = 0; i < size; i++) {
			elementData[i] = arr[i];
		}
	}
	
}