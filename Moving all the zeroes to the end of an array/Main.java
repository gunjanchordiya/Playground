import java.util.Scanner;
class Main{
  public static void move(int arr[],int n)
  {
    int count =0;
    int temp;
    for(int i=0;i<n;i++)
    {
      if((arr[i] != 0))
      {
        temp = arr[count];
        arr[count]=arr[i];
        arr[i]=temp;
        count++;
      }
    }
  }
    public static void print(int arr[],int n)
    {
      for(int i=0;i<n;i++)
      
        System.out.print(arr[i]+" ");
      }
      public static void main(String args[]) {
       // Type your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=in.nextInt();
        }
        move(arr,n);
        print(arr,n);
      }
  }
  