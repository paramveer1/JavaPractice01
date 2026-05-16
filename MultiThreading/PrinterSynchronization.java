package MultiThreading;

public class PrinterSynchronization {
   
    public static void main(String[] args) {
         Resource r = new Resource();
        PrinterSynchronizationThread pst = new PrinterSynchronizationThread(r);
        Thread t1 = new Thread(pst);

        Thread t2 = new Thread(pst);
        t1.setName("Raju");
        t2.setName("Kaju");
                t2.start();
                t1.start();

    }
    
}
