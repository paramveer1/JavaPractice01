package MultiThreading;

public class Resource {
  String name = Thread.currentThread().getName();
    synchronized void print (){
        for(int i = 1;i<10;i++){
                    System.out.println(name + " is running");
      }
    }
    
}
