package MultiThreading;



public class RunnableOneClassMultiplethread implements Runnable{
   

     public static void main(String[] args) {
        RunnableOneClassMultiplethread table = new RunnableOneClassMultiplethread();
        //         RunnableOneClassMultiplethread table2 = new RunnableOneClassMultiplethread();
        // RunnableOneClassMultiplethread table3 = new RunnableOneClassMultiplethread();

                Thread thread1 = new Thread(table);
                Thread thread2 = new Thread(table);
                Thread thread3 = new Thread(table);

                // thread1.setName("Thread1");
                thread1.start();
                                thread2.start();
                                                thread3.start();



        
    }
    public void run(){
         String name = Thread.currentThread().getName();
        if(name.equals("Five")){
            

        }
        System.out.println(" Thread task is being executedd");
    }

    


}

