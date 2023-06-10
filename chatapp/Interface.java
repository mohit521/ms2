 import java.util.*;
 interface Vipin {
    void fly();
 }
 class Mohit implements Vipin{
    public void fly(){
        System.out.println("I can fly");
    }
    public void ms(){
        System.out.println("Can i also fly");
    }
}
    class Dps
{
    public static void main(String[] args) {
        Vipin obj=new Mohit();
        obj.fly();
         Mohit r =(Mohit)obj;
         r.ms();
    }
}
