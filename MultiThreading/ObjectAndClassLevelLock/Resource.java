package MultiThreading.ObjectAndClassLevelLock;

public class Resource {
   

    void printer(String name) {

        // if (name.equals("Thread-0")) {
            synchronized (Resource.class) {
                 
                for (int i = 1; i <= 10; i++) {
                    System.out.println(name + " is Printing");

                }

            }
            // System.out.println(name + " is printing");
        // } else{

        // }

    }

}
