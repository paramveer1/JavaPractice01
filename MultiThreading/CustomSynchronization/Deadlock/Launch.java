package MultiThreading.CustomSynchronization.Deadlock;

public class Launch {
    public static void main(String[] args) {
        Resource resource = new Resource();
        MyThread myThread = new MyThread(resource);
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);

        thread1.start();

        thread2.start();

    }

}
