import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class Game extends JPanel implements ActionListener {
    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    private final int CHARACTER_SIZE = 40;
    private final int TIMER_DELAY = 50;

    private int characterX;
    private int characterY;
    private int score;
    private boolean gameOver;

    private ArrayList<Element> elements;
    private Random random = new Random();

    private Timer timer;
    public Game() {
setPreferredSize(new Dimension(WIDTH, HEIGHT));
setBackground(Color.BLACK);
setFocusable(true);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
    if (!gameOver) {
        int key = e.getKeyCode();

    if(key == KeyEvent.VK_UP && characterY > 0){
        characterY -= 20;
        } 
        else if (key == KeyEvent.VK_DOWN && characterY < HEIGHT - CHARACTER_SIZE) {
            characterY += 20;
        }
        else if (key == KeyEvent.VK LEFT && characterX > 0){
        characterX -= 20;
        }
        else if (key == KeyEvent.VK_RIGHT && characterX < WIDTH - CHARACTER_SIZE) {
        characterX += 20;
        }
    }
    else {
        if (e.getKeyCode() == KeyEvent.VK_R){
            restartGame();
        }
    }
 }
});
    initializeGame();
    }

    private void initializeGame(){
        characterX = WIDTH / 2;
        characterY = HEIGHT / 2;
        score = 0;
        gameOver = false;
        elements = new ArrayList<>();
        timer = new Timer(TIMER_DELAY, this);
        timer.start();
        spawnElements();
    }
    
    private void restartGame() {
        initializeGame();
        repaint();
    }

    private void spawnElements(){
        for(int i = 0; i < 10; i++){
            elements.add(new Element(radom.nextInt(WIDTH - 50), random.nextInt(HEIGHT - 50), "🍓", 10));
        }
    }
    
}