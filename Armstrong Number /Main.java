import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int d1 = n/100;//System.out.println(d1);
      int d2=(n/10)%10;//System.out.println(d2);
      int d3 = n%10;//System.out.println(d3);
      int sum,pow=3;
      sum=( d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
      //System.out.println(sum);
      if(sum==n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}