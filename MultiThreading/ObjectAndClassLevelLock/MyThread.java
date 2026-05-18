package MultiThreading.ObjectAndClassLevelLock;

public class MyThread implements Runnable{
    Resource r ;
    Resource r2;
     MyThread(Resource r ,Resource r2){
        this.r = r;
        this.r2 = r2;


    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if(name.equals("Thread-0")){
        r.printer(name);
       
        
    } else {
        r2.printer(name);
    }
    
}
}
