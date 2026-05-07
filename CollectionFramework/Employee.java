package CollectionFramework;

public class Employee implements Comparable {
    int age ;
    int id;
    String name;
    Employee(int id,String name,int age){
        super();
        this.age = age;
         this.name = name;
         this.age = age;

    }
    @Override
    public int compareTo(Object o) {
     Employee e  =   (Employee)o;
     
        return id - e.id ;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Employee[Id: "+id+" Name: "+name+"Age: "+ age+"]";
    }
    
}
