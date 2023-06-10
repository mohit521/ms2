import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int a=sc.nextInt();
        int sum=0;
        while(a>0){
              int rem=a%10;

              
                sum=sum*10+rem;
                a=a/10;    
        }
        System.out.println(sum);
        
    }
   
}
