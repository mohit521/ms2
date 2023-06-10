abstract class ShowAbb
{
    protected abstract void animal(); 
    void deer(){
        System.out.println("deer is there to eat the grass");
    }   
}
class Human extends ShowAbb{

public  void animal(){
    System.out.println("here we go man");
}
public static void main(String[] args) {
    Human obj1= new Human();
    obj1.animal();
    obj1.deer();
}
}