package InterThreadCommunication;

public class MyThread extends Thread {
    Printer printer ;
    String name;
    MyThread(Printer printer){
        this.printer = printer;

    }


    public void run(){
      String  name = currentThread().getName();

        if(name.equals("Sender")){
              printer.sendMessage("Hi");

        }
        else{
            for(int i = 0;)
            printer.readMessage();
        }
      

    }
    
}
