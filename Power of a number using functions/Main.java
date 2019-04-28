import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner in= new Scanner(System.in);
    int n= in.nextInt();
    int m= in.nextInt();
    power(n,m);
  }
  public static int power(int a,int b)
  {
    int result =1;
    while(b!=0)
    {
      result=result*a;
      b--;
    }
    System.out.println(result);
    return 0;
  }
}