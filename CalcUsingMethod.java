import java.util.Scanner;

public class CalcUsingMethod {



    int addition(int a, int b) {
        int add = a + b;
        return add;

    }

    int Subtraction(int a, int b) {
        int sub = a - b;
        return sub;

    }

    int multiplication(int a, int b) {
        int multiply = a * b;
        return multiply;

    }

    int divison(int a, int b) {
        int div = a / b;
        return div;

    }

    public static void main(String[] args) {
        CalcUsingMethod calcUsingMethod = new CalcUsingMethod();
        Scanner sc = new Scanner(System.in);
        System.out.println("calculator is On: Choose Desired Option");
        while(true){
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Divison");
        int n = sc.nextInt();
        System.out.println("Enter First number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Sum is " + calcUsingMethod.addition(a, b));

                break;
            case 2:
                
                System.out.println("Subtraction is " + calcUsingMethod.Subtraction(a, b));
                break;
            case 3:
                
                System.out.println("multiplication is " + calcUsingMethod.multiplication(a, b));
                break;
            case 4:
                
                System.out.println("Quotient  is " + calcUsingMethod.divison(a, b));
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }
        System.out.println("Do you want to continue ? 1.Yes 2.No");
        int input = sc.nextInt();
        if(input==2 ){
            System.out.println("Thanks for using our services");
            return;
        }
        sc.close();
    }
    
    }

}
