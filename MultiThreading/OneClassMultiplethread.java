package MultiThreading;

public class OneClassMultiplethread extends Thread{

    public void run(){
        for(int i = 1;i<= 10;i++){
           
           
            System.out.println(currentThread().getName()+" "+2*i);
        }
    }
    public static void main(String[] args) {
       
        System.out.println( currentThread().getName());

        OneClassMultiplethread threadd1 = new OneClassMultiplethread();
        OneClassMultiplethread threadd2 = new OneClassMultiplethread();
        OneClassMultiplethread threadd3 = new OneClassMultiplethread();
          threadd1.setName("pehla");
                    threadd2.setName("dusra");

                              threadd3.setName("tisra");

                              threadd1.setPriority(9);
                                                            threadd2.setPriority(5);

                                                                                          threadd3.setPriority(1);



       
        threadd1.start();
                threadd2.start();
                        threadd3.start();
                       



        System.out.println();

        
    }
    
}
