import java.util.*;
public class Countrec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        //int n=sc.nextInt();
        Countrec obj=new Countrec();
         obj.meth(10);
       System.out.println("finally after completing the task i am all here");
    }
    void meth(int n){
        System.out.println(n);
        if(n<=0){
             return;
        }
     meth(n-1);
    }
    
}
