package FileIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream {
    public static void main(String[] args) {
        String s = "param";

        try{
            FileOutputStream fos = new FileOutputStream("c:/users/pc/desktop/fileio/file.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(s.getBytes()); 
        bos.close();
        FileInputStream fis = new FileInputStream("c:/users/pc/desktop/fileio/file.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
       byte [] b =  bis.readAllBytes();
        System.out.print(new String(b));
        }
        catch( IOException e){
            System.out.println(e);
        }
        
    }
    
}
