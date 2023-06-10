public class SumRec {
    public static void main(String[] args) {
        int n=6;
        rec(n);
    }
    static void rec(int n){
        int sum=0;
        if(n<=1){
         return ;
        }else{
        sum=sum+n;
        rec(n-1);
    }
    System.out.println(sum);
}}