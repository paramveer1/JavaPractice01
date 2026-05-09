package MultiThreading;
import java.util.Scanner;





class Seven extends Thread{
@Override
    public void run(){
        Scanner sc = new Scanner(System.in);
        for(int i = 1;i<= 10;i++){
            //  System.out.println("hiiiii");
            //   sc.nextInt();
            System.out.println(7*i);

            
           
           
           try{sleep(500);}
           catch(InterruptedException e){
            System.out.println("Exception handled");
           }
        

    }
}
}



class Two extends Thread{
    public void run(){
        for(int i = 1;i<= 10;i++){
            System.out.println(2*i);
             try{
                sleep(500);

             }
           catch(InterruptedException e){
            System.out.println("Exception handled");
           }
        }

}
}

public class Launch {
    public static void main(String[] args) {
         Two two = new Two();
        Seven seven = new Seven();
         two.start();
        seven.start();
       
       
        
    }
    
}

