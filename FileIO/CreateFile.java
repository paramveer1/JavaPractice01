package FileIO;
import java.io.File;
import java.io.IOException;

public class CreateFile  {
    public static void main(String[] args) throws IOException{
       
         for(int i = 1;i<10;i++){
                    File file = new File("C:\\Users\\pc\\Desktop\\FileIO\\param.txt");

             if(  file.delete()){
            System.out.println("File Deleted");
        }
        else{
            System.out.println("File Not Deleted");
        }
            
        }
      
       


    }
    
}
