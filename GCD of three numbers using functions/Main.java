import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in= new Scanner (System.in);
      int n1= in.nextInt();
      int n2= in.nextInt();
      int n3= in.nextInt();
      System.out.println(gcd(n1,n2,n3));
     
	}
  public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	public static int gcd(int a, int b, int c) {

		return gcd(gcd(a, b), c);

	}
      
}