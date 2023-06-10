class Inheri {
     void mth1(){
        System.out.println("here we are going to start");
    }
     void mth2(){
        System.out.println("now here we are move for the second part ");
    }
}
    
 class B extends Inheri{
    void mth2(){
        System.out.println("i am all from here only");
    }
    
    public static void main(String[] args) {
        
    B obj1=new B();
    obj1.mth1();
    obj1.mth2();
        
    }

}
