/**
 * Created by Administrator on 13-7-27.
 */

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Administrator on 13-7-25.
 */
public class Game {

    private static int[][] board = new int[5][5];
    private static int m = board[0][0];
    private int i1, i2, i3, i4, i5, i6;


    public void setBoard() {

        Random random = new Random();
        Game game = new Game();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                game.board[i][j] = random.nextInt(6);
                System.out.print(game.board[i][j] + "  ");
            }
            System.out.println();

        }

    }

    public void start() {
        i1 = 0;
        for (int j = 1; j < board[i1].length; j++) {
            if (board[i1][j] != board[i1][j - 1]) {
                break;
            }
            i1 = j;
        }
        System.out.println("i1  " + i1);
//
//        for (int j = 0; j <= i1; j++) {
//            for (int k = 1; k < board.length; k++) {
//                if(board[k][j] !=board[k-1][j]){
//                    break;
//                }
//                i2 = j;
//                i3 = k - 1;
//            }
//
//        }
//        System.out.print("i3  " + i3 + "  ");
//        System.out.println("i2  "+i2);
//        for (int i = 1; i <= i3; i++) {
//            for (int j = 1; j < board[i].length ; j++) {
//                if(board[i][j] !=board[i][j-1]){
//                    break;
//                }
//                i4 = i;
//                i5 = j - 1;
//            }
//        }
//        System.out.print("i4  " + i4 + "   ");
//        System.out.println("i5  "+i5);
    }

    public void iuput() {

        boolean b = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("iuput n :");
        int n = scanner.nextInt();
        while (b = false) {
            if (n == m) {
                n = scanner.nextInt();
            } else {
                b = true;
            }
        }


    }

    public static void main(String[] args) {

        Game game = new Game();
        game.setBoard();
        game.start();


    }


}

