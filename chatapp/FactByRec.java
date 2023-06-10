import java.util.Scanner;
public class FactByRec {
    int fct=1;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        FactByRec fc=new FactByRec();
        int d=fc.meth1(n);
        System.out.println("The factorial is "+d);
        }
        int meth1(int  n  ) {
            if(n>1){
                 fct=fct*n;
                meth1(n-1);
            }
            return fct;
        }
}

