package emppm;

import java.util.LinkedList;

public class A {
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(10);
		
		System.out.println(list.getLast().intValue());
		
	}

}
