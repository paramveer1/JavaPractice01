package InterThreadCommunication;

public class Printer {
    String message ;
    void sendMessage(String message){
        System.out.println("message sent");
        this. message = message;


    }

    void readMessage(){
        System.out.println("Message Received : " + message);

    }

    
    
}
