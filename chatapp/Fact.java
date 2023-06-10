import java.util.Scanner;
public class Fact {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number for factorial");
        int a= sc.nextInt();
        int d=1;
        while(a>0){
             d=d*a;
            a--;
        }
        System.out.println("the factorial is"+" "+d);
        
        System.out.println("press y or Y to exit the code");
        String yn=sc.next();
        if(yn.equals("y")||yn.equals("Y")){
            System.out.println("EXIT");
        }
    }
    
}
