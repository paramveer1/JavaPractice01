package FileIORevise;

import java.io.FileInputStream;
// import java.io.FileNotFoundException;d
import java.io.IOException;
import java.io.FileOutputStream;
import  java.io.File;

public class CopyPaste {
    public static void main(String[] args) {
        try{
             File file = new File("c:/users/pc/desktop/source/sourceFile");
             file.createNewFile();
            
        FileInputStream fis = new FileInputStream("c:/users/pc/desktop/source/sourceFile");
      byte [] b = fis.readAllBytes();
      System.out.println("File Copied");
      FileOutputStream fos = new FileOutputStream("c:/users/pc/desktop/destination/destinationFile");
      fos.write(b);
      System.out.println("File pasted");

     
      fis.close();
      System.out.println(file.delete());
        }catch( IOException e){
        e.printStackTrace();

        }
        
    }
    
}
