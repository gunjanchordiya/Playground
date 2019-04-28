import java.util.Scanner;
class Main 
{
  public static void left_rotate_even_ele(int size , int arr[] , int count)
  { 
    int first_even_idx = 1 ;
    int last_even_idx;
    if(size % 2 == 0)
    {
      last_even_idx = size - 1 ;
    }
    else
    {
      last_even_idx = size - 2 ;
    }
    for( int rotation = 1 ; rotation <= count ; rotation++)
    {
      int temp  = arr[first_even_idx];
      for( int i = 3 ;i < size ;i = i + 2)
      { 
        arr[i - 2 ] = arr[i];
      }
      arr[last_even_idx] = temp;
    }
  }
    public static void right_rotate_odd_ele(int size , int arr[] , int count)
    {
      int first_odd_idx = 0 ;
      int last_odd_idx;
      if(size % 2 == 1 )
      {
        last_odd_idx = size - 1 ;
      }
      else
      {
        last_odd_idx = size - 2;
      }
     
      for(int rotation = 1 ; rotation <=count ; rotation++)
      {
        int temp = arr[last_odd_idx];
        for( int i = (last_odd_idx - 2 ) ; i >=0 ;i = i - 2 )
        {
          arr[i + 2 ] = arr [ i] ;
        }
        arr[first_odd_idx]= temp ;
      }
    }
      
  public static void main(String args[])
    {
       Scanner in = new Scanner (System.in);
     int size = in.nextInt();
    int arr[]=new int[size];
    for(int i = 0 ; i < size ; i++ )
    {
      arr[i] = in.nextInt();
    }
    int count = in.nextInt();
    left_rotate_even_ele(size , arr , count );
    right_rotate_odd_ele(size , arr , count );
    for( int i=0 ; i < size; i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
  	}
