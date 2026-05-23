package InterThreadCommunication;

public class Launch {
    public static void main(String[] args) {
        Printer printer = new Printer() ;
        MyThread myThread = new MyThread(printer);
                MyThread myThread2 = new MyThread(printer);
                myThread.setName("Sender");
                                myThread2.setName("Receiver");

        //   myThread2.setPriority(Thread.MAX_PRIORITY);
        //             myThread.setPriority(Thread.MIN_PRIORITY);

         myThread2.start();
        myThread.start();
       
    }
    
}
