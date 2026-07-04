package FileIO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args)  {
        // File file = new File("c:/users/pc/desktop/fileio/file.txt");
    //    try{ file.createNewFile();}
    //    catch(IOException e){
    //     System.out.println("Exception handled");

    //    }
        // file.delete();
        try{ 
            File file = new File("c:/users/pc/desktop/fileio/file1");
            file.createNewFile();
        FileOutputStream fos = new FileOutputStream("c:/users/pc/desktop/fileio/file1");
        FileInputStream fis = new FileInputStream("c:/users/pc/desktop/fileio/file1");
        String s = "param";
        // byte[] b = ;
        
         fos.write(s.getBytes());
         System.out.println("File Written");
         
         while (true){
            int n = fis.read();
            if(n==-1)break;
          
            System.out.print((char)n);
            

         }
        


        }
        catch(IOException e){
            System.out.println("File Not Found Exception");

        }
       

    }
    
}
