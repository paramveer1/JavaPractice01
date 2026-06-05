package FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CreateFile  {
    public static void main(String[] args) throws IOException {
        String s = "param";
        byte[] byteArray = s.getBytes();
        File file = new File("c:\\Users\\pc\\desktop\\FileIO\\io.txt");
        FileOutputStream fos = new FileOutputStream("c:\\Users\\pc\\Desktop\\FileIO\\io.txt");
        fos.write(byteArray);
        FileInputStream fis = new FileInputStream("c:\\Users\\pc\\Desktop\\FileIO\\io.txt");
      
       while (true) {
         int i =  fis.read();
         if(i==-1)break;
         System.out.print((char)i);
        
       }
     
     
        // if( file.createNewFile()){
        //     System.out.println("File Created");
        // }
        // else{
        //     System.out.println("File Not Created");
        // }
        // file.delete();

        
       


    }
    
}
