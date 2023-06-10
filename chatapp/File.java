import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class File{
    public File(String string) {
    }

    public static void main(String[] args) throws FileNotFoundException
    {
       String path="C:\\Users\\User\\Downloads\\ms.txt";
       FileInputStream is=new FileInputStream(path);
       try(Scanner sc=new Scanner(is,StandardCharsets.UTF_8.name())){
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
       }
    }

    public int length() {
        return 0;
    }
}