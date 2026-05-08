package CollectionFramework;
import java.util.Comparator;

public class CustomOrder implements Comparator {
    public int compare(Object c, Object e ){
        Employee current = (Employee)c;
        Employee existing = (Employee)e;

        return   existing.id - current.id;

    }
    
}
