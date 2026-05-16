package MultiThreading;

public class PrinterSynchronizationThread  implements Runnable{
    Resource r ;
    PrinterSynchronizationThread(Resource r ){
        this.r = r;
    }

     PrinterSynchronizationThread(){
        
    }
    public   void run(){
         
         String name = Thread.currentThread().getName();
        if(name.equals("Kaju")){
            r.print(name);

        }
        else{
              r.print(name);

        }
      
     
    }
    
}
