import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      int str_len=str.length();
      int end = str_len-1;
      int front=0;
      boolean is_pallindrome=true;
      while(front<end)
      {
        if(str.charAt(front) != str.charAt(end))
        {
          is_pallindrome=false;
        break;
        }
        front++;
        end--;
      }
      if(is_pallindrome == true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
        
      
        
    } 
}