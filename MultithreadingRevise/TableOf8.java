package MultithreadingRevise;

public class TableOf8 extends Thread {
    public void run(){
        for(int i = 1;i<= 10;i++){
            System.out.println(8*i);
        }
    }
    
}
