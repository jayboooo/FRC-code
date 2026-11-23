import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        char[][] board = new char[3][3];
        board[0][0] = ' ';
        board[0][1] = ' ';
        board[0][2] = ' ';
        board[1][0] = ' ';
        board[1][1] = ' ';
        board[1][2] = ' ';
        board[2][0] = ' ';
        board[2][1] = ' ';
        board[2][2] = ' ';
        printBoard(board);
        boolean gameEnd = false;
        while (!gameEnd){
             System.out.println("where would you like to place your piece? 1-9");
            int place = input.nextInt();
            input.nextLine();
            System.out.println("What piece would you like to place? X or O");
            String player = input.nextLine();
            //place player piece on the board
            if (place == 1 && player.equalsIgnoreCase("X")){
                board[0][0] = placePiece(0,0,'X');
            }
            else if (place == 2 && player.equalsIgnoreCase("X")){
                board[0][1] = placePiece(0,1,'X');
            }
            else if (place == 3 && player.equalsIgnoreCase("X")){
                board[0][2] = placePiece(0,2,'X');
            }
            else if (place == 4 && player.equalsIgnoreCase("X")){
                board[1][0] = placePiece(1,0,'X');
            }
            else if (place == 5 && player.equalsIgnoreCase("X")){
                board[1][1] = placePiece(1,1,'X');
            }
            else if (place == 6 && player.equalsIgnoreCase("X")){
                board[1][2] = placePiece(1,2,'X');
            }
            else if (place == 7 && player.equalsIgnoreCase("X")){
                board[2][0] = placePiece(2,0,'X');
            }
            else if (place == 8 && player.equalsIgnoreCase("X")){
                board[2][1] = placePiece(2,1,'X');
            }
            else if (place == 9 && player.equalsIgnoreCase("X")){
                board[2][2] = placePiece(2,2,'X');
            }
            else if (place == 1 && player.equalsIgnoreCase("O")){
                board[0][0] = placePiece(0,0,'O');
            }
            else if (place == 2 && player.equalsIgnoreCase("O")){
                board[0][1] = placePiece(0,1,'O');
            }
            else if (place == 3 && player.equalsIgnoreCase("O")){
                board[0][2] = placePiece(0,2,'O');
            }
            else if (place == 4 && player.equalsIgnoreCase("O")){
                board[1][0] = placePiece(1,0,'O');
            }
            else if (place == 5 && player.equalsIgnoreCase("O")){
                board[1][1] = placePiece(1,1,'O');
            }
            else if (place == 6 && player.equalsIgnoreCase("O")){
                board[1][2] = placePiece(1,2,'O');
            }
            else if (place == 7 && player.equalsIgnoreCase("O")){
                board[2][0] = placePiece(2,0,'O');
            }
            else if (place == 8 && player.equalsIgnoreCase("O")){
                board[2][1] = placePiece(2,1,'O');
            }
            else if (place == 9 && player.equalsIgnoreCase("O")){
                board[2][2] = placePiece(2,2,'O');
            }
            //show the board after each turn
            printBoard(board);
//player x win check
            if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X'){
                System.out.println("Player X wins");
                gameEnd = true;
            }
            else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X'){
                System.out.println("Player X wins");
                gameEnd = true;
            }
            else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X'){
                System.out.println("Player X wins");
                gameEnd = true;
            }
            else if (board[0][0] == 'x' && board[1][0] == 'x' && board[2][0] == 'x'){
                System.out.println("Player x wins");
                gameEnd = true;
            }
            else if (board[0][1] == 'x' && board[1][1] == 'x' && board[2][1] == 'x'){
                System.out.println("Player x wins");
                gameEnd = true;
            }
            else if (board[0][2] == 'x' && board[1][2] == 'x' && board[2][2] == 'x'){
                System.out.println("Player x wins");
                gameEnd = true;
            }
            else if (board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x'){
                System.out.println("Player x wins");
                gameEnd = true;
            }
            else if (board[0][2] == 'x' && board[1][1] == 'x' && board[2][0] == 'x'){
                System.out.println("Player x wins");
                gameEnd = true;
            }

// player o win check

            if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O'){
                System.out.println("Player O wins");
                gameEnd = true;
            }
            else if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O'){
                System.out.println("Player O wins");
                gameEnd = true;
            }
            else if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O'){
                System.out.println("Player O wins");
                gameEnd = true;
            }
            else if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O'){
                System.out.println("Player O wins");
                gameEnd = true;
            }
            else if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O'){
                System.out.println("Player O wins");
                gameEnd = true;
            }
            else if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O'){
                System.out.println("Player O wins");
                gameEnd = true;
            }
            else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'){
                System.out.println("Player O wins");
                gameEnd = true;
            }
            else if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O'){
                System.out.println("Player O wins");
                gameEnd = true;
            }
        }

    }
    public static void printBoard(char[][] board){
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("_____");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("_____");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);

    }
    public static char placePiece(int row, int col, char piece){
        // Implementation for placing a piece on the board
        char[][] boardReplace = new char[3][3];
        boardReplace[row][col] = piece;
        return boardReplace[row][col];
    }
}
