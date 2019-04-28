import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner (System.in);
      int size= in.nextInt();
      int arr[]= new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=in.nextInt();
      }
      int largest=arr[0];
      for(int i=0;i<size;i++)
      {
        if(largest<arr[i])
          largest=arr[i];
      }
      System.out.println(largest);
    
          
        
      
      
        
    }
}