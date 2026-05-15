package MultiThreading;

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        RaceConditionThread rct = new RaceConditionThread();
        Thread t1 = new Thread(rct);
                Thread t2 = new Thread(rct);
                t1.start();
                                t2.start();
                                t2.join();
                                t1.join();
                                System.out.println(rct.s.length());



    }
    
}
