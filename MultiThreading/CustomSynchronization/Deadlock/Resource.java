package MultiThreading.CustomSynchronization.Deadlock;

public class Resource {
    String r1 = "r1";
    String r2 = "r2";

    String r3 = "r3";

     void resource() {
        String name = Thread.currentThread().getName();

        if (name.equals("Thread-0")) {
            synchronized(r1){
            System.out.println(name + " is running "+r1);
            synchronized(r2){
            System.out.println(name + " is running "+r2);
             synchronized(r3){
            System.out.println(name + " is running "+r3);
            }
            }
            }
            
           
        } else {
            synchronized(r3){
            System.out.println(name + " is running "+r3);
             synchronized(r2){
            System.out.println(name + " is running "+r2);
              synchronized(r1){
            System.out.println(name + " is running "+r1);
            }
            }
            }
           
          

        }
    }

}
