package CollectionFramework;

import java.util.TreeSet;
import java.util.Set;
import java.util.Collections;

public class ComparableDemo {
    public static void main(String[] args) {
         Set treemap = new TreeSet(new CustomOrder()); //Collections.reverseOrder()
    Employee e4 = new Employee(1,"param",25 );
        Employee e3 = new Employee(2,"shanu",30 );

            Employee e1 = new Employee(3,"deepa",27 );

                Employee e2 = new Employee(4,"bhanwar",47);

    treemap.add(e1);
    treemap.add(e2);
        treemap.add(e3);

            treemap.add(e4);

            System.out.println(treemap);
           


        
    }

}
