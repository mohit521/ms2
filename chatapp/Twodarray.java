import java.util.Scanner;
public class Twodarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of Row_____________"+":"+" ");
        int m=sc.nextInt();
        System.out.print("Enter the number of column_______________"+":"+" ");
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.print("Enter the array here ______________"+":"+" ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();

            }
        }
        System.out.println("Printing the Array__________________"+":"+" ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
