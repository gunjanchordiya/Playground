import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in= new Scanner (System.in);
    int n= in.nextInt();
    int m=3;
    int count;
    for(count=1;count<=n;count++)
    {
      System.out.print(count);
   
     // System.out.println( );
      
      if(count%m==0 && count!=n)
        System.out.print(",");
    }
   // System.out.println();
  }
}