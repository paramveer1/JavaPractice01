package MultiThreading.CustomSynchronization.Deadlock;

public class MyThread  implements Runnable{
    
   Resource resource;

    MyThread(Resource r){
        resource = r;
    }
    @Override
    public void run() {
   

resource.resource();
   
    }
    
}
