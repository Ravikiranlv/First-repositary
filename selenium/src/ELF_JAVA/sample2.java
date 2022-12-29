package ELF_JAVA;

public class sample2 {

	public static void main(String[] args) {
		int space=3;
		int star=1;
		for(int j=1;j<=4;j++)
		{
		for(int i=1;i<=space;i++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		star++;
		space--;
		}
  }

}
