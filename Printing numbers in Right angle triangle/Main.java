import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner (System.in);
      int n=in.nextInt();
      for(int j=1;j<=n;j++)
      {
        for(int i=1;i<=j;i++)
        {
          System.out.print(j);
        }
        System.out.print("\n");
      }
	}
}