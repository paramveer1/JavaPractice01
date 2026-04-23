package Pattern.AlphabetPattern;

public class RightTriangle {
    public static void main(String[] args) {
        char c = 'A';
        for(char i = 'A';i<='E';i++){
            for(char j = 'A';j<=i;j++){
                System.out.print(c++);
            }
            System.out.println();
        }
    }
    
}
