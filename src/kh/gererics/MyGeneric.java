package kh.gererics;

import java.util.ArrayList;

public class MyGeneric<E> {
	private ArrayList<E> list = new ArrayList<>();
	
	public void add(E item) {
		list.add(item);
	}
	
	public E get(int index) {
		return list.get(index);
	}
	
	public E remove(int index) {
		return list.remove(index);
	}
	
	public int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}
