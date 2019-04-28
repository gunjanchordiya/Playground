import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      int val=n;
      for(int i=1;i<=n;i++)
      {
        //for(int space=1;space<=n-i;space++)
      //  {
        //  System.out.print(" ");
     //   }
        for(int j=val;j>=1;j--)
        {
          System.out.print(j);
        //  val++;
        }
        val--;
        System.out.print("\n");
      }
      
	}
}