package InterThreadCommunication;

public class Printer {
    String message ;
    boolean isSent ;
   synchronized void sendMessage(String message){
        if(isSent== true){
            try{wait();}catch(InterruptedException e){ System.out.println("Exception Handled");}
        }
         this. message = message;
        System.out.println(message + " sent");
        isSent = true;
        notify();
       


    }

   synchronized void readMessage(){
        if(isSent == false ){
           try{ wait();} catch(Exception e){
            System.out.println("Exception Handled");
           }
        }
        System.out.println("Message Received  : " + message);
        isSent = false;
        notify();

    }

    
    
}
