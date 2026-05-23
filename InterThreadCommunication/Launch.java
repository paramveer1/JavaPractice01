package InterThreadCommunication;

public class Launch {
    public static void main(String[] args) {
        Printer printer = new Printer() ;
        MyThread myThread = new MyThread(printer);
        myThread.start();
    }
    
}
