package FileIORevise;
import java.io.FileNotFoundException;
import java.io.FileReader;
import  java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo {
    public static void main(String[] args) {
        String s = "param";
        FileWriter fw = null;
        String fileLocation = "c:/users/pc/desktop/destination/destinationfile"; 
        try{
                     fw = new FileWriter(fileLocation);
                        
                          fw.write(s);

                            fw.close();
                            System.out.println("File Written in destination");
                          FileReader fr = new FileReader(fileLocation);
                          
                          while(true){
                            int n = fr.read();
                            if(n==-1){
                                break;

                            }
                            
                            System.out.println(((char)n));


                          }
                         
                         
                        
                         
                        

        }
        catch(IOException e){
            e.printStackTrace();
        }
        // finally{
        //     try{
                           


        //     }
        //     catch(IOException e){
        //         e.printStackTrace();
        //     }


        // }
       
        
    }
    
}
