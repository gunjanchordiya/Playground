import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner in= new Scanner(System.in);
      int n = in.nextInt();
      int sum=0, count=1;
      for(count = 1 ; count <= n ; count ++)
      {
        sum = sum + count;
      }
      System.out.println(sum);
	}
}