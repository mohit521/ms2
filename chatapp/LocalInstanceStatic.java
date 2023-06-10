

 class LocalInstanceStatic {
    int a=10;
    static int b=20;
    public static void main(String[] args) {
        LocalInstanceStatic l=new LocalInstanceStatic();
        System.out.println(l.a);
        l.A();
        
    }
    void  A(){
        LocalInstanceStatic l=new LocalInstanceStatic();
        System.out.println(l.a);
        System.out.println(LocalInstanceStatic.b);
    }
}