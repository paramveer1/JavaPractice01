package FileIORevise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        try{
        FileInputStream fis = new FileInputStream("c:/users/pc/desktop/destination/destinationfile");
        BufferedInputStream bos = new BufferedInputStream(fis);
        
      
      
       while(true){
         int a = bos.read();
        if(a==-1){
            break;
        }
        System.out.print((char)a);
       }

    
    }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
