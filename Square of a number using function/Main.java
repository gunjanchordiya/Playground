import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
      Scanner in= new Scanner (System.in);
     int a= in.nextInt();
	 // Type your code here   
     System.out.println(square(a));
	} 
  public static int square (int n)
  {
    int sqq;
    sqq= n*n;
    return sqq;
  }

}