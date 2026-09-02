package FileIORevise;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class WriteFile {
    public static void main(String[] args) {


        String s = "param singh raja";
        byte[] b = s.getBytes();

try{
                        FileOutputStream fos = new FileOutputStream("c:/users/pc/desktop/fileio/param");
   fos.write(b);
   FileInputStream fis = new FileInputStream("c:/users/pc/desktop/fileio/param");
   while(true){
   int n = fis.read();
    if(n==-1){
        break;
    }
    System.out.println( (char)n);

   }
 
  
  }
   
catch(FileNotFoundException e ){
    e.printStackTrace();

}
catch(IOException e){
    e.printStackTrace();
}
       
       


        
    }
    
}
