import java.util.Random;
import java.util.Scanner;

public class Game {

    static int submarineX, submarineY;
    static int score = 0;
    static boolean gameRunning = true;
    static char[][] ocean;
    static int oceanWidth = 20, oceanHeight = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    ocean = new char[oceanHeight][oceanWidth];
    Random rand = new Random();

    submarineX = oceanWidth / 2;
    submarineY = oceanHeight / 2;
    
placeTreasureAndObstacles(rand);
displayOcean();

    while (gameRunning) {
        System.out.println("Use arrow keys to move (W = up, S = down, A = left, D = right).");
        System.out.println("Current Score: " + score);
        String move = scanner.nextLine().toUpperCase();

        if(move.equals("W") && submarineY > 0){
            submarineY--;
        } else if (move.equals("S") && submarineY < oceanHeight - 1) {
            submarineY++;
            
        } else if (move.equals("A") && submarineX > 0) {
            submarineX--;
        } else if (move.equals("D") && submarineX < oceanWidth - 1){
            submarineX++;
        } else {
            System.out.println("Invalid move.");
        }
        
        if (checkCollision()) {
            System.out.println("Game Over! You hit an obstacle.");
            gameRunning = false;
        }
        else if(checkTreasure()){
            score++;
            placeTreasureAndObstacles(rand);
        }
        displayOcean();
    }
        scanner.close();
}
public static void placeTreasureAndObstacles(Random rand) {
    for (int i = 0; i < oceanHeight; i++){
    for (int j = 0; j < oceanWidth; j++){
        ocean[i][j] = '~';
    }
    }
ocean[submarineY][submarineX] = 'S';
ocean[rand.nextInt(oceanHeight)][rand.nextInt(oceanWidth)] = 'T';
ocean[rand.nextInt(oceanHeight)][rand.nextInt(oceanWidth)] = 'O';
}

public static boolean checkCollision() {
    return ocean[submarineY][submarineX] == 'O';
}

public static boolean checkTreasure() {
    if (ocean[submarineY][submarineX] == 'T'){
        ocean[submarineY][submarineX] = '~';
        return true;
    }
    return false;
}
public static void displayOcean(){
    for (int i = 0; i < oceanHeight; i++) {
        for (int j = 0; j < oceanWidth; j++) {
            System.out.print(ocean[i][j]);
        } 
        System.out.println();
        }
    }
}
