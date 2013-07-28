/**
 * Created by Administrator on 13-7-27.
 */

import java.util.Random;
import java.util.Scanner;


/**
 * Created by Administrator on 13-7-25.
 */
public class Game {
    private int n = 5;
    private static int[][] board = new int[5][5];
    private static int temp;//接受输入的值
//    private static int m = board[0][0];

    public void setBoard() {
        Random random = new Random();
        Game game = new Game();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                game.board[i][j] = random.nextInt(5) + 1;
                System.out.print(game.board[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void input() {
        System.out.println("input:");
        Scanner scanner = new Scanner(System.in);
        temp = scanner.nextInt();
    }
    public void PlayGame() {
        boolean b = true;
        while (b) {
            Game.input();
            for (int i = 0; i < board.length-1; i++) {
                for (int j = 0; j < board[i].length-1; j++) {
                    if (board[i][j+1] != temp && board[i+1][j] != temp) {
                        i = 0;
                        b=false;
                    } else {
//                        board[i][j] = temp;
                    }
                }
            }
            if(!b){
                System.out.println("输入有误！");
                //break;
            }
        }

    }
    public void judge(){
        for (int i = 0; i <board.length-1 ; i++) {
            for (int j = 0; j <board[i].length-1 ; j++) {
                if(board[i][j]==board[i+1][j]&&board[i][j]==board[i][j+1]){
                    board[i+1][j]=temp;
                    board[i][j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Game game = new Game();
//        game.SelectedGrade();
        game.setBoard();
        game.PlayGame();
    }


}

