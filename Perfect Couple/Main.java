import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int [size];
      for(int i = 0 ; i < size ; i++)
      {
        arr[i] = in.nextInt();
      }
          int value=in.nextInt();
          pair(size,arr,value);
        
      
    }
        public static void pair(int size,int arr[],int value)
        {
          for( int idx = 0 ; idx < size ; idx++)
          {
            for( int idx2 = idx+1 ; idx2< size ; idx2++)
            {
              int sum = arr[idx] + arr[idx2] ;
              if(sum == value)
              {
                System.out.println(arr[idx]+","+" "+arr[idx2]);
              }
            }
          }
    }
}