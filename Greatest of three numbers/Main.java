import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner (System.in);
      int n1=in.nextInt();
        int n2=in.nextInt();
      int n3=in.nextInt();
      int greater=0;
      if(n1>n2&&n1>n3)
        greater=n1;
      else if(n2>n1&&n2>n3)
        greater=n2;
      else 
        greater=n3;
      System.out .println(greater);
    
        
        
      
    }
}