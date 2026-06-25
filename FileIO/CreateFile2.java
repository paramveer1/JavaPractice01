package FileIO;
import java.io.File;
import java.io.IOException;

public class CreateFile2 {
    public static void main(String[] args) throws IOException{
        File file = new File("c:\\users\\pc\\desktop\\FileIO\\File2.txt");
        file.createNewFile();
        
    }
    
}
