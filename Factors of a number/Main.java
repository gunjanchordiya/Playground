import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      int count=1;
      for( ; count<=n;count++)
      {
          if(n%count==0)
            System.out.println(count);
      }
	}
}