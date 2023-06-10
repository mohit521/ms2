 class Deep {
     int a=10;
     int b=50;
}
class Test
{
    void add(){
        Deep i= new Deep();
        System.out.println((i.a)+(i.b));
    }
    void mul(){
        Deep i= new Deep();
        System.out.println((i.a)*(i.b));
    }
    public static void main(String[] args) {
        Test t=new Test();
        t.add();
        t.mul();
    

    }
}

