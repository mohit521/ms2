import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.File;

public class File1 {

	public static void main(String[] args) {
		try {
			//File f= new File("C:\\Users\\user\\lsg.text");
			//createNewFile is used to create the file in the choose directory...
			//delete method to delete the created file ...f.delete();
			 //boolean val=f.createNewFile();
		    // System.out.println(val);
			// if(val==true){
				FileWriter fw= new FileWriter("E://ms.text");
				fw.write("my name is mohit singh and i am the best ");
				fw.close();
				//
				FileReader fr=new FileReader("ms.text");
				BufferedReader br=new BufferedReader(fr);
			    char [] l=new char[50];
				br.readLine();
				
				for(char c:l) {
				System.out.print(c);
		        }
		   // }
        }
				catch (IOException e) {
					e.printStackTrace();
					}
					
}
	}		