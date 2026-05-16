package MultiThreading;

public class Resource {
 
    synchronized void print (String name){
        
        for(int i = 1;i<10;i++){
                    System.out.println(name + " is running");
                   
      }
    }
    
}
