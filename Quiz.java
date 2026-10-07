import java.util.Scanner;


public class Quiz {
    public static void main(String[] args) {
        int correct = 0;
        Scaner answer = new Scanner(System.in); 
       System.print("what is 2 + 2: ");
       int questionOneA = answer.nextInt();
       answer.nextLine();
       System.out.println();

       if (QuestioOneA == 4){
        System.out.println("Correct");
        correct++;
       }else{
        System.out.println("Wrong");
       }

       System.out.println();
       System.print("Is canada better than the USA: ");
       String questionTwoA = answer.nextLine();
       answer.nextLine();
       System.out.println();

       if (questionTwoA.equalsIgnoreCase("yes")){
        System.out.println("Correct");
        correct++;
       }else{
        System.out.println("Wrong");
       }

        System.out.println();
       System.print("What year is it: ");
       int questionThreeA = answer.nextInt();
       answer.nextLine();
       System.out.println();

       if (questionThreeA == 2026){
        System.out.println("Correct");
        correct++;
       }else{
        System.out.println("Wrong");
       }

       System.out.println();
       System.print("What country are we in: ");
       String questionFourA = answer.nextInt();
       answer.nextLine();
       System.out.println();

       if (questionFourA.equalsIgnoreCase("Isreal")){
        System.out.println("Correct");
        correct++;
       }else{
        System.out.println("Wrong");
       }

       System.out.println();
       System.print("What is ther square root of 9: ");
       Int questionFiveA = answer.nextInt();
       answer.nextLine();
       System.out.println();

       if (questionFiveA == 3){
        System.out.println("Correct");
        correct++;
       }else{
        System.out.println("Wrong");
       }

       System.out.println(0);
       System.out.println(correct);

        






    }
}
