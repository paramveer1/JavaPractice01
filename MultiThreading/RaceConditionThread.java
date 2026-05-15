package MultiThreading;

public class RaceConditionThread implements Runnable {
    StringBuffer s = new StringBuffer();
    // String s = "";
    @Override
    public void run() {
        for(int i = 1;i<101;i++){
        s = s.append("a");
        // s= s.concat("a");

        }
       
        
    }
    
}
