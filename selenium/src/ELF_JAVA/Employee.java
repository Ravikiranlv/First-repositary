//WAP TO COPY THE VALUES OF ONE OBJECT INTO ANOTHER BY ASSIGNING THE VALUES OF ONE OBJECT INTO ANOTHER.

package ELF_JAVA;

public class Employee {
	int refno;
	String refname;

	Employee(int i, String n) {
		refno = i;
		refname = n;
	}

	Employee(Employee e) {
		refno = e.refno;
		refname = e.refname;
	}

	void display() {
		System.out.println(refno + " " + refname);
	}

	public static void main(String[] args) {
		int i;
		String n;
		Employee e1 = new Employee(i = 123, n = "realme");
		Employee e2 = new Employee(e1);
		e1.display();
		e2.display();
	}
} // o/p=123 realme
	// o/p=123 realme
