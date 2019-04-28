import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int n;
      int count = 1;
      Scanner in = new Scanner (System.in);
      n = in.nextInt();
      while ( count <= n)
      {
          System.out.println("I am a Java Developer");
        count = count + 1;
      }
	}
}