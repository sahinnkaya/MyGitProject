package JavaProject2;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        char[][] numbers = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        Scanner scan = new Scanner(System.in);

        int count = 1;
        char player = 'X';

        while (true) {
            drawBoard(numbers);
            if (winner(numbers, player)) {
                break;
            }
            if (count == 10) {
                System.out.println("The game is drawn");
                break;
            }
            System.out.print("Enter the row and cell: ");
            int row = scan.nextInt();
            int cell = scan.nextInt();
            if (numbers[row][cell] == 'X' || numbers[row][cell] == 'O') {
                System.out.println("Choose another cell");
            }
            else {
                if (count % 2 == 1) {
                    numbers[row][cell] = 'X';
                    player = 'X';
                }
                else {
                    numbers[row][cell] = 'O';
                    player = 'O';
                }
                count++;
            }
        }
    }

    public static void drawBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + ",");
            }
            System.out.println();
        }
    }

    public static boolean winner(char[][] board, char player1) {
        if ((board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] != ' ') ||
                (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != ' ') ||
                (board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] != ' ') ||
                (board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] != ' ') ||
                (board[2][0] == board[1][1] && board[0][0] == board[0][2] && board[2][0] != ' ') ||
                (board[0][2] == board[1][0] && board[0][2] == board[2][2] && board[0][2] != ' ') ||
                (board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] != ' ') ||
                (board[1][0] == board[1][1] && board[1][0] == board[1][2]&& board[1][0] != ' ')) {
            System.out.println("Player " + player1 + " is winner.");
            return true;
        }
        return false;
    }



}