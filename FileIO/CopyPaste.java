package FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPaste {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("c:/users/pc/desktop/fileio/source/notes.png");
       byte[] b =  fis.readAllBytes();
       fis.close();
       File file = new File("c:/users/pc/desktop/fileio/source/notes.png");
       file.delete();
       FileOutputStream fos = new FileOutputStream("c:/users/pc/desktop/fileio/destination/notes.png");
       fos.write(b);
      
    }
    
}
