import java.util.Scanner;
public class EvenOdd {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a=cs.nextInt();
        if(a%2==0){
            System.out.println("number is even ");
        }else{
            System.out.println("number is odd");
        }

    }
}
