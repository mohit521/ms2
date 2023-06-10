import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArraylist {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(arr[3]);
        arr[3]=6;
        System.out.println(arr);
        
    ArrayList <String> ms=new ArrayList<>(Arrays.asList("manish","raman","vipin"));
    System.out.println(ms);
    System.out.println(ms.get(1));
    System.out.println(ms.set(2,"pawan"));
    System.out.println(ms);
    System.out.println(ms.size());
    System.out.println(ms.add("punit"));
    System.out.println(ms.clone());
    System.out.println(ms.add(""));
    System.out.println(ms);
    }
}
