package ELF_JAVA;
   interface I1
   {
	   void a(int a);
   }

public class LAMBDA_EXPRESHION {
	public static void main(String[] args) {
		I1 a1=(a)->
		{
			System.out.println("Hello");
		};
		a1.a(10);
	}

}
