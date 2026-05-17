package MultiThreading.CustomSynchronization;

public class MyThread implements Runnable {
    Resource resource ;
    MyThread(Resource r){
        resource = r;

    }

    public void run(){
        for(int i = 1;i<=100000;i++){
        resource.change();
        }

    }
    
}
