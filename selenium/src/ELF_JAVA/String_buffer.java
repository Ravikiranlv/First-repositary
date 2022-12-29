package ELF_JAVA;

import java.util.Collections;
import java.util.LinkedList;

public class String_buffer {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(1);
		l.add(2);
		l.add(5);
		l.add(3);
		Collections.sort(l);
		System.out.println(l);
	}

}
