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
        
    }
}