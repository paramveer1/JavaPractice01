package InterThreadCommunication;

public class MyThread extends Thread {
    Printer printer ;
   
    MyThread(Printer printer){
        this.printer = printer;

    }


    public  void run(){
      String  name = currentThread().getName();
      for(int i = 0;i<10;i++){
         if(name.equals("Sender")){
              printer.sendMessage("Hi " + i );

        }
        else{
            
            printer.readMessage();
        }

      }

       
      

    }
    
}
