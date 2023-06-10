import java.util.Scanner;
import java.util.Arrays;
public class Searching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array by self");
        int num[]=new int[6];
        for(int i=0;i<num.length;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("Enter the number here ");
            int a=sc.nextInt();
       int d= search(num , a );
       System.out.println("your number at the index "+d);
        
    }
     static int search(int arr [],int a){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int rakh=arr[i];
            
            if(rakh==a){
                return i;
           
        }
        
    }
    return -1;
}

}
