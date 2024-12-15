import java.util.Random;
import java.util.Scanner;
public class UnderwaterNavigationGame {

    static int submarineX, submarineY;
    static int score = 0;
    static boolean gameRunning = true;
    static char [][] ocean;
    static int oceanWidth = 20, oceanHeight = 10;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    }
    ocean = new char[oceanHeight][ocean Width];
    Random rand = new Random();

    submarineX = oceanWidth / 2;
    submarineY = oceanHeight / 2;
        placeTreasureAndObstacles(rand);
        displayOcean();

    while(gameRunning){
        System.out.println("Use arrow keys to move (W = up, S = down, A = left, D = right).");
        System.out.println("Current Score: " + score);
        String move = scanner.nextLine();

        if(move.equals("W") && submarineY > 0){
            submarineY--;
        }
        else if (move.equals("S") && submarineY < oceanHeight - 1){
            submarineY++;
            
        }
        else if (move.equals("A") && submarineX > 0){
            submarineX--;
        }
        else if (move.equals("D") && submarineX < oceanWidth - 1){
            submarineX++;
        }
        else {
            System.out.println("Invalid move.");
        }
    }
}