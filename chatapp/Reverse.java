import java.util.Scanner;
class A{
    public void pick(String p){
        String d=reverse(p);
        System.out.println(d);
        
    }
    
}


class Reverse
{
    // Complete the function
    // str: input string
    public static void main(String[] str)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String s=sc.next();
        A t=new A();
        t.pick(s);
        // Reverse the string str
    }
}