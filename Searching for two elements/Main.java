import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner (System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=in.nextInt();
      }
      int searchele1=in.nextInt();
      int searchele2=in.nextInt();
      int ele1_i=-1;
      int ele2_i=-1;
      for(int i=0;i<size;i++)
      {
        if(searchele1==arr[i])
        {
          ele1_i=i;
        }
        if(searchele2==arr[i])
        {
          ele2_i=i;
        }
          
        }
  System.out.println(ele1_i);
  System.out.println(ele2_i);
   }
}