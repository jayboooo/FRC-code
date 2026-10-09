import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many students are there: ");
        int length = input.nextInt();
        System.out.println();
        input.nextLine();
        int[] numStudent = new int[length];
        for(int student = 0; student < length; student++){
            
            System.out.print("What is the grade of student " + (student + 1) + ": "); 
            numStudent[student] = input.nextInt();
            input.nextLine();
            System.out.println();
        }

        int userChoice = 0;

        while(userChoice != 4){
            System.out.println("1: Show all scores.\n2: Show highest score \n3: Show average score \n4: Exit");
            userChoice = input.nextInt();
            System.out.println();
            System.out.println();
            if(userChoice == 1){

                for(int i = 0; i < length; i ++){
                    System.out.println("Student "+ (i+1) + "grade is: " + numStudent[i] + "%");
                }
                System.out.println();
                System.out.println();

            }else if(userChoice == 2){
                int highScore = 0;
                for(int i = 0; i < length; i++){
                    if(numstudent[i] > highScore){
                        highScore = numStudent[i];
                    }

                    System.out.println("The student with the highest score is student " + (i+1) + "with a grade of: " + numStudent[i] + "%");
                    System.out.println();
                    System.out.println();
                }

            }else if(userChoice == 3){

            }else{
                break;
            }



        }

    }
}
