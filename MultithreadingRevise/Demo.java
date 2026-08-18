package MultithreadingRevise;

public class Demo {
    public static void main(String[] args) {
        TableOf8 te = new TableOf8();
        te.start();
        Tableof2 tt = new Tableof2();
        tt.start();
    }
    
}
