import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of your choice :");
      int a=sc.nextInt();
      int sum=0;
      int p=a;
      while(a>0){
        int r=a%10;
        sum=(sum*10) + r;
         a=a/10;
        }
      if(sum==p){
          System.out.println("The number is palindrome");
      }
      else
      {
          System.out.println("The number is not the palindrome");
        
      }
    }
}