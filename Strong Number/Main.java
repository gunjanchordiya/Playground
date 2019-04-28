import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int n = in.nextInt();
      int sum , fact1=1,count1=1,count2=1,count3=1,i;
      int fact2=1,fact3=1;
      int d1=n/100;
     // System.out.println(d1);
     int d2=(n/10)%10;
    // System.out.println(d2);
      int d3= n%10;
    //  System.out .println(d3);
      for(i=1;i<=d1;i++)
      {
        fact1= fact1*d1;
        count1++;
      }
     // System.out.println(fact1);
      for(int j=1;j<=d2;j++)
      {
         fact2=fact2*j;
      count2++;
      }
     // System.out. println(fact2);
      for(int k=1;k<=d3;k++)
      {
         fact3= fact3*k;
         count3++;
      }
     // System.out.println(fact3);
      sum= fact1+fact2+fact3;
      //System.out .println(sum);
      if(sum==n)
        System.out.println("Yes");
      else
        System.out.println("No");
    
	}
}