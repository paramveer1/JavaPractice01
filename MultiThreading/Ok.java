package MultiThreading;


    public class Ok {
    public static void main(String[] args) {
        Table table = new Table();
                Thread thread = new Thread(table);
                thread.start();

        
    }
    
}
    

