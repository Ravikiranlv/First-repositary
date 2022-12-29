package ELF_JAVA;

public class Strong_number {
	public static void main(String[] args) {
		int num=145;
		int i=num;
		int strong=0;
		while(i!=0)
		{
			int rem=i%10;
			int mult=1;
			for(int j=1;j<=rem;j++)
			{
				mult=mult*j;
			}
			strong=strong+mult;
			i=i/10;
		}
		if(num==strong)
		{
			System.out.println("strong number");
		}
		else
		{
			System.out.println("It is  not a strong number");
		}
	
	}
	
}