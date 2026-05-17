package MultiThreading.CustomSynchronization;

public class Resource {
    StringBuffer sb = new StringBuffer();
int count = 0;
int race = 0;

public void change(){
    race++;
        sb.append("a");
        
        synchronized(this){
              count++; 
       
        }
        
       
       
    }

    public void sbLength(){
        System.out.println(count);
        
    }
    public void countOverlapThread(){
       System.out.println( count -race);
    }
    
}
