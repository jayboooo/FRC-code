import java.util.Scanner;


public class Quiz {
    public static void main(String[] args) {
        int correct = 0;
        Scanner answer = new Scanner(System.in); 
       System.out.print("what is 2 + 2: ");
       int questionOneA = answer.nextInt();
       answer.nextLine();
       System.out.println("");

       if (questionOneA == 4){
        System.out.println("Correct");
        correct++;
       }else{
        System.out.println("Wrong");
       }

       System.out.println("");
       System.out.print("Is canada better than the USA: ");
       String questionTwoA = answer.nextLine();
       answer.nextLine();
       System.out.println("");

       if (questionTwoA.equalsIgnoreCase("yes")){
        System.out.println("Correct");
        correct++;
       }else{
        System.out.println("Wrong");
       }

        System.out.println("");
       System.out.print("What year is it: ");
       int questionThreeA = answer.nextInt();
       answer.nextLine();
       System.out.println("");

       if (questionThreeA == 2026){
        System.out.println("Correct");
        correct++;
       }else{
        System.out.println("Wrong");
       }

       System.out.println("");
       System.out.print("What country are we in: ");
       String questionFourA = answer.nextLine();
       answer.nextLine();
       System.out.println("");

       if (questionFourA.equalsIgnoreCase("Isreal")){
        System.out.println("Correct");
        correct++;
       }else{
        System.out.println("Wrong");
       }

       System.out.println("");
       System.out.print("What is ther square root of 9: ");
       int questionFiveA = answer.nextInt();
       answer.nextLine();
       System.out.println("");

       if (questionFiveA == 3){
        System.out.println("Correct");
        correct++;
       }else{
        System.out.println("Wrong");
       }

       System.out.println("");
       System.out.println(correct);

        






    }
}
