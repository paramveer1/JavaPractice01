package BasicPrograms;
public class Switch {
    public static void main(String[] args) {
        int i = 7;
        switch ( i)
        {
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("tuesday");
            break;
            case 3: System.out.println("WEd");
            break;
            case 4 : System.out.println("thursday");
            break;
            case 5: System.out.println("Fri");
            break;
            case 6: System.out.println("Sat");
            break;
            case 7: System.out.println("Sunday");
            break;

            default: System.out.println("Invalid Input");
        }
    }
    
}
