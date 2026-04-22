package Pattern;

public class DiagonalLines {
    public static void main(String[] args) {
        for(int i = 1;i<= 5;i++){
            for(int j = 1;j<=5;j++){
                if(i+j==5)
                System.out.print("4 ");
            else if(i+j==6)
                System.out.print("5 ");
            else if(i+j==4)
                System.out.print("3 ");
            else if(i+j==3)
                System.out.print("2 ");
            else if(i+j==2)
                System.out.print("1 ");
            else if(i+j==7)
                System.out.print("6 ");
            else if(i+j==8)
                System.out.print("7 ");
            else if(i+j==9)
                System.out.print("8 ");
            else if(i+j==10)
                System.out.print("9 ");
            else
            {
                System.out.print("  ");
            }
            }
            System.out.println();
        }
    }
    
}
