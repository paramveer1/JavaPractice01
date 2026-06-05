package FileIO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPasteFile {
    public static void main(String[] args) throws IOException{
        String s = "paramveer";
        byte [] b1  = s .getBytes();
        File file = new File("c:\\users\\pc\\DESktop\\source/param.txt");
         file.createNewFile();
               FileOutputStream foss = new FileOutputStream("c:\\users\\pc\\DESktop\\source/param.txt");
               foss.write(b1);

        FileInputStream fis = new FileInputStream("c:\\users\\pc\\DESktop\\source/param.txt");
        
       byte [] b =  fis.readAllBytes();
       fis.close();
       foss.close();
       file.delete();
       FileOutputStream fos = new FileOutputStream("c:\\users\\pc\\DESktop\\destination/param.txt");
       fos.write(b);

       
      
    }
    
}
