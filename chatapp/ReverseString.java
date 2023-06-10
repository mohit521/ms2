import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        char ch;
        String s1,s2="";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string : ");
        s1=sc.nextLine();
        int l=s1.length();
        for(int i=0;i<l;i++){
            ch=s1.charAt(i);
            s2=ch+s2;
            
        }
        System.out.println(s2);
    }
    
}
