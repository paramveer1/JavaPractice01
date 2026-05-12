package MultiThreading;

public class ThreadUsingRunnable {
    public static void main(String[] args) throws InterruptedException {

        Table table = new Table();
        Thread thread1 = new Thread(table);
                Thread thread2 = new Thread(table);
                thread1.setName("Thread1");
                                thread2.setName("Thread2");

                thread1.setPriority(Thread.MAX_PRIORITY);
                                thread2.setPriority(Thread.MIN_PRIORITY);
                                                                System.out.println(Thread.MAX_PRIORITY);

                                System.out.println(Thread.MIN_PRIORITY);


        thread1.start();
                thread2.start();
                thread1.join();
                thread2.join();
                System.out.println("Main thread running");

        
       
    }
    
}


class Table implements Runnable{
    @Override
    public void run(){
        for(int i = 1;i<= 10;i++){
            System.out.println(Thread.currentThread().getName()+" " + i*2);

        }

    }


}
