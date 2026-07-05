package FileIO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args)  {
       
        try{ 
            // File file = new File("c:/users/pc/desktop/fileio/file2");
//             file.createNewFile();
//             if (file.createNewFile()) {
//     System.out.println("New file created.");
// } else {
//     System.out.println("File already exists.");
// }
        // FileOutputStream fos = new FileOutputStream("c:/users/pc/desktop/fileio/file1");
        FileWriter fw = new FileWriter("c:/users/pc/desktop/fileio/file10");
        fw.write("shanuSingh");
        fw.close();
        // FileInputStream fis = new FileInputStream("c:/users/pc/desktop/fileio/file1");
        FileReader fileReader = new FileReader("c:/users/pc/desktop/fileio/file10");
        
        while(true){
           int n =  fileReader.read();
           if(n==-1)break;
           System.out.print((char)n);


        }
        // String s = "paramveer";
        // byte[] b = ;
        
        //  fos.write(s.getBytes());
        //  System.out.println("File Written");
         
        //  while (true){
        //     int n = fis.read();
        //     if(n==-1)break;
          
        //     System.out.print((char)n);
            

        //  }
        


        }
        catch(IOException e){
            System.out.println("File Not Found Exception");

        }
       

    }
    
}
