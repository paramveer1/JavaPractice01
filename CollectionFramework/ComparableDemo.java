package CollectionFramework;

import java.util.TreeMap;
import java.util.Map;

public class ComparableDemo {
    public static void main(String[] args) {
         Map treemap = new TreeMap();
    Employee e4 = new Employee(1,"param",25 );
        Employee e3 = new Employee(2,"shanu",30 );

            Employee e1 = new Employee(3,"deepa",27 );

                Employee e2 = new Employee(4,"bhanwar",47);

    treemap.put(e1,111);
    treemap.put(e2,222);
        treemap.put(e3,232);

            treemap.put(e4,2872);

            System.out.println(treemap);
           


        
    }

}
