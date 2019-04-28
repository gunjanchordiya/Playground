import java.util.Scanner;
class Main{
  static int palindrome(int arr[],int begin,int end)
  {
    if(begin >= end)
    {
      return 1;
    }
    if(arr[begin]==arr[end])
    {
      return palindrome(arr,begin+1 , end-1);
    }
    else
    {
      return 0;
    }
  }
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=in.nextInt();
      }
     // size = arr.length;
      if(palindrome(arr,0,size-1)==1)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
    }
