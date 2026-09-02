package FileIORevise;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("c:/users/pc/desktop/Fileio/NewFile.txt");
        try{
  boolean b = file.createNewFile();
   if(b){
            System.out.println("File Created");
        }
        else{
            System.out.println("File Not Created");
        }
        }
        catch(IOException e){
            e.printStackTrace();
        }
      
       
        // b =  file.delete();
        // if(b){
        //     System.out.println("File deleted");
        // }
        // else{
        //     System.out.println("File not Deleted");
        // }

    }
    
}
