import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int n = in.nextInt();
    prime(n);
     // for (int i=2;n%i==0;i++)
       // System.out.println(n);
       	}
  public static int prime(int m)
  {
   // for (int i=2;m%i==0;i++)
    //  System.out.println(i);
     for(int i=1; i<=m; i++)
    {
      int  fact=0;
        for(int j=1; j<=m; j++)
        {
            if(i%j==0)
                fact++;
        }
        if(fact==2)
           System.out.println(i);
    }
    return 0;
  }
}