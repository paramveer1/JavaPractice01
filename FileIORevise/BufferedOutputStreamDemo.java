package FileIORevise;

import  java.io.BufferedOutputStream;
import  java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) {
        String s = "Shanu";
        byte b [] = s.getBytes();
       try{
        FileOutputStream fos = new FileOutputStream("c:/users/pc/desktop/destination/destinationfile");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        fos.write(b);
       } 
       catch(IOException e){
        e.printStackTrace();

       }
    }
    
}
