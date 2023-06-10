public class RecursionToAdd {
    static int sum=0;
    public static void main(String[] args) {
        int n=6;
        func(n);
    }
    static void func(int n){
        while(n<=0){
        return ;
        }
        sum= sum +n;
        func(n-1);
        System.out.println(sum);
    }
   
    
}
