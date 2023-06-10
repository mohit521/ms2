class Ds {
    void m1()
    {
        System.out.println("mohit singh ");
    }
}
class Dim extends Ds{
       void m1()
    {
        System.out.println("pawan singh ");
    }
    public static void main(String[] args) {
        Ds th=new Ds();
        th.m1();
        Dim pd=new Dim();
        pd.m1();
    }
}