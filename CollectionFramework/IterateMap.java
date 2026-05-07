package CollectionFramework;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;


public class IterateMap {
    public static void main(String[] args) {
        Map map = new TreeMap(Collections.reverseOrder());
        map.put(1,"param");
        map.put(8,"Deepa");
         map.put(6,"param");
          map.put(9,"param");
           map.put(5,"param");
        map.put(3,"Shanu");

        Set <Entry<Integer,String>> set  =  map.entrySet();
        for(Entry<Integer,String> entry: set){
          System.out.println( entry.getKey()+"---->"+entry.getValue()); 

        }

    }
    
}
