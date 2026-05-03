package Arrays;

class Employee {
    int id;
    String name;
    int noOfExperience;

    Employee(int id, String name, int noOfExperience) {
        this.id = id;
        this.name = name;
        this.noOfExperience = noOfExperience;

    }

}

public class Demo {
    public static void main(String[] args) {
            Employee e1 = new Employee(1, "param", 2);
            Employee e2 = new Employee(2, "Deepa", 3);
            Employee e3 = new Employee(3, "shanu", 4);

            Employee e4 = new Employee(2, "Nand", 15);
            Employee e5 = new Employee(2, "bhanwar", 5);

            Employee empArr [] = {e1,e2,e3,e4,e5};
            for(Employee e : empArr){
              
                System.out.println("Name is : "+ e.name);
                                System.out.println("id is : "+ e.id);
                                                System.out.println("experience is : "+ e.noOfExperience);


               
               System.out.println();

        }
    }
}