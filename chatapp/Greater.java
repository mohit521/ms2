import java.util.*;
public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a =sc.nextInt();
        System.out.println("Enter the second number ");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("A is greater with value "+" " +(a-b));
        }else{
            System.out.println("B is greater with value"+" "+(b-a));
        }

    }
    
}
