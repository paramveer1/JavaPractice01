package FileIO;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CopyPaste1 {
    public static void main(String[] args) {
          try{
    // FileWriter fw = new FileWriter("c:/users/pc/desktop/fileio/filee.txt");
    // fw.write("param is a good boy");
    // fw.close();

    FileReader fr = new FileReader("c:/users/pc/desktop/fileio/filee.txt");
    while(true){
       int n =  fr.read();
       if(n==-1)break;
       System.out.print((char)n);
    }

    }
    catch(IOException e){
        System.out.println(e);

    }
        
    }
  

    
}
