import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=in.nextInt();
      }
      subsets(size,arr);
    }
  public static void subsets(int size,int arr[])
  {
    for(int idx = 0 ; idx <=size-2;idx++)
    {
      for(int idx1 = idx+1 ; idx1<size ;idx1++)
      {
        for(int idx2 = idx1+1 ; idx2<size ; idx2++)
        {
          System.out.print("(" + arr[idx] + "," + " " + arr[idx1] + "," + " " + arr[idx2] + ")" + " " );
        }
      }
      System.out.println();
    }
        
    }
}