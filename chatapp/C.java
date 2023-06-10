import java.io.FileWriter;
 public class C
{
    public static void main(String[] args)
    {
        try {
            FileWriter fw=new FileWriter("C:/user/user/sd1");
            fw.write("mohit");
            fw.flush();
            fw.close();
        }
        //FileReader always before the BufferedReader
        //BufferedReader read one line at a time ...

        catch (Exception e)
        {
            e.printStackTrace();
        }  
    }
}