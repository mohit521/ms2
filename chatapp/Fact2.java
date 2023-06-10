public class Fact2 {
    public static int factorial(int p){
        if(p<=1){
            return 1;
        }
        return p*factorial(p-1);
    }
    public static void main(String[] args) {
        int x=5;
        System.out.println(factorial(x));
    }
    
}

