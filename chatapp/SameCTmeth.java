public class SameCTmeth {
    void mohit(){
        System.out.print("mohit singh "+" ");
    }
    void mohit(String a){
        System.out.println("singh");
    }
    public static void main(String[] args) {
        SameCTmeth t=new SameCTmeth();
        t.mohit();
       
        t.mohit("p");

    }
}
