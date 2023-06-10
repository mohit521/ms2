import java.util.*;
class DSP{
    int a=10;
    int b=30;
}
class Child extends DSP{
    int i=20;
    int j=40;
    void add(int x,int y)
    {
        System.out.println(x+y);
        System.out.println(super.a+super.b);
        System.out.println(this.i+this.j);
        System.out.println(x*y);

    }

    public static void main(String[] args) {
        C c=new C();
        c.add(50,60);
    }
}
