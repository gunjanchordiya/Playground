import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner( System.in);
      int n = in.nextInt();
      int count,temp;
      
      for ( temp = 1,count=1; temp<= n;count=count+2, temp++)
        System.out.println(count);
      
	}
}