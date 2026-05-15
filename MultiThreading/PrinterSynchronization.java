package MultiThreading;

public class PrinterSynchronization {
    public static void main(String[] args) {
        PrinterSynchronizationThread pst = new PrinterSynchronizationThread();
        Thread t1 = new Thread(pst);

        Thread t2 = new Thread(pst);
        t1.start();
                t2.start();

    }
    
}
