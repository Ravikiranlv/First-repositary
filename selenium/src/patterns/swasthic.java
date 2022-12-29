//WAP TO PRINT PRINT PATTERN AS SWASTHIC

package patterns;

public class swasthic {
	public static void main(String[] args) {

	     System.out.print("* ");
	     for(int i=1; i<=3; i++)
	     {
	         System.out.print("  ");
	     }
	     for(int i=1; i<=5; i++)
	     {
	         System.out.print("* ");
	     }
	     System.out.println();
	     for(int j=1; j<=3; j++)
	     {
	        System.out.print("* ");
	        for(int i=1; i<=3; i++)
	        {
	            System.out.print("  ");
	        }
	        System.out.println("*");
	     }
	     for(int i=1; i<=9; i++)
	     {
	        System.out.print("* ");
	     }
	     System.out.println();
	     for(int j=1; j<=3; j++)
	     {
	        for(int i=1; i<=4; i++)
	        {
	           System.out.print("  ");
	        }
	        System.out.print("* ");
	        for(int i=1; i<=3; i++)
	        {
	           System.out.print("  ");
	        }
	        System.out.println("* ");
	     }
	     for(int i=1; i<=5; i++)
	     {
	         System.out.print("* ");
	     }
	     for(int i=1; i<=3; i++)
	     {
	         System.out.print("  ");
	     }
	     System.out.print("* ");
	 }

}
