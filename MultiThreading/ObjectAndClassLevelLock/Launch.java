package MultiThreading.ObjectAndClassLevelLock;

public class Launch {
    public static void main(String[] args) {
        Resource r = new Resource();
         Resource r2 = new Resource();

        MyThread myThread = new MyThread(r,r2);
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);
        thread1.start();
                thread2.start();


    }

}
