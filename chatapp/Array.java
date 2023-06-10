import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size_______________________");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Take the value in the array_____________________");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Print Array_______________________");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);

        }

    }
}
