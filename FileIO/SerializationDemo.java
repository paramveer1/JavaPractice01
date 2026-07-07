package FileIO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;

public class SerializationDemo {
    public static void main(String[] args) {
        Employee e = new Employee(1,"param" ,55555);
        File file = new File("c:/users/pc/desktop/fileio/NewFolder");
        file.mkdir();
        try{
                    FileOutputStream fos = new FileOutputStream("c:/users/pc/desktop/fileio/NewFolder/objectFile");
        ObjectOutputStream  os = new ObjectOutputStream(fos);


        }
        catch(IOException o){
            


        }
    }
    
}
