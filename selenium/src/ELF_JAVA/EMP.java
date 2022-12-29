package ELF_JAVA;

import java.util.Arrays;
import java.util.Collections;

import com.graphbuilder.struc.LinkedList;

public class EMP implements Comparable {
	String name;
	double eid;
	double salary;

	public EMP(String name, int eid, double salary) {
		this.name = name;
		this.eid = eid;
		this.salary = salary;
	}

	public String toString() {
		return "name:" + this.name + " " + "eid:" + this.eid + " " + "salary:" + this.salary;
	}

	public int CompareTo(Object obj) {
		EMP e = (EMP) obj;
		if (this.eid == e.eid)
			return 0;
		else if (this.eid > e.eid)
			return 1;
		else
			return -1;
	}

	public static void main(String[] args) {
		java.util.LinkedList l = new java.util.LinkedList<>();
		l.add(new EMP("Ravikiran lv", 1, 80000));
		l.add(new EMP("Vidhya", 2, 810000));
		l.add(new EMP("Ranjini", 3, 420));
		System.out.println(l);
		Collections.sort(l);
		for (Object o1 : l) {
			EMP e = (EMP) o1;
			System.out.println(e);
		}
		EMP e[] = { new EMP("Shivanandha", 2, 3000), new EMP("vani", 1, 40000), new EMP("nikil", 9, 410000) };
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
		System.out.println(l);

		Arrays.sort(e);
		for (EMP o : e) {
			EMP e1 = (EMP) o;
			System.out.println(e1);
		}
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
