package MultithreadingRevise.FileHandling;

import java.io.File;
import java.io.IOException;


public class CreateFile {
    public static void main(String [] args){
        File file = new File("c:/users/pc/desktop/fileio/param");
       try{
        boolean b = file.createNewFile();
         if(b==true){
        System.out.println("File created");
       }
       else{
        System.out.println("File Not created");
       }

       } 
       catch(IOException e){
        System.out.println("IOException Handled ");


       }
      

    }

    
}
