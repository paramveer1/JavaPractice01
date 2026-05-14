package MultiThreading;



public class RunnableOneClassMultiplethread implements Runnable{
   

     public static void main(String[] args)  {
        RunnableOneClassMultiplethread table = new RunnableOneClassMultiplethread();
        //         RunnableOneClassMultiplethread table2 = new RunnableOneClassMultiplethread();
        // RunnableOneClassMultiplethread table3 = new RunnableOneClassMultiplethread();

                Thread thread1 = new Thread(table);
                Thread thread2 = new Thread(table);
                Thread thread3 = new Thread(table);
                thread1.setPriority(10);
                thread3.setPriority(1);

                // thread1.setName("Thread1");
                thread1.start();
                                thread2.start();
                                                thread3.start();



        
    }
    public void run(){
         String name = Thread.currentThread().getName();
        if(name.equals("Thread-0")){
            tablePrint(2);
            

        }

         if(name.equals("Thread-1")){
            tablePrint(3);
            

        }
         if(name.equals("Thread-2")){
            tablePrint(4);
            

        }
                  


        
    }

    void tablePrint(int n) {
        for(int i = 1;i<= 10;i++){
            System.out.println(i*n+ " "+ Thread.currentThread().getName());
        }
        try{
        Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println("Exception Handled");
        }

    }

    


}

