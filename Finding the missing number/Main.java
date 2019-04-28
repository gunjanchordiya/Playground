import java.util.Scanner;
class Main{
  static int missing(int a[],int n)
  {
    int i,total;
    total = (n+1) * (n+2) / 2 ;
    for(i=0 ; i<n; i++)
    
      total -= a[i];
      return (total-3);
  } 
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int miss = missing(a,n);
      System.out.println(miss);
      
    }
}