package FileIO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile  {
    public static void main(String[] args) throws IOException{
        String s= "param";
        byte[] b = s.getBytes();
        FileOutputStream fos = new FileOutputStream("C:\\Users\\pc\\Desktop\\FileIO\\First.txt");
      
       
        fos.write(b);
      
       


    }
    
}
