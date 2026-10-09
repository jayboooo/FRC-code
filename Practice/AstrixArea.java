import java.util.Scanner;

public class AstrixArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        for (int row = 0; row < length; row++) {
            for (int col = 0; col < length; col++) {
                if(col == length-1){
                    System.out.println("*");

                }else{
                    System.out.print("*");
                }


                
            }
        }
    }
}