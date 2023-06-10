import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();

     if((a%4==0)||(a%100==0)||(a%400==0)){
        System.out.println("the year is the leap year ");
     }else{
        System.out.println("The year is not the leap year ");
     }
    }
}
