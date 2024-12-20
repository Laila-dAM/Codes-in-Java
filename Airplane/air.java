import java.util.Random;
import java.util.Scanner;

public class air {
    static int alt = 1000;
    static int spd = 300;
    static int wnd = 0;
    static int turb = 0;

public static void adjAlt(int adj){
    alt += adj;
    if (alt < 0) alt = 0;
    else if (alt > 10000) alt = 10000;
}
public static void adjSpd(int adj){
    spd += adj;
    if (spd < 100) spd = 100;
    else if (spd > 600) spd = 600;
}   
public static void simWthr(){
    Random rand = new Random();
    wnd = rand.nextInt(21) - 10;
    turb = rand.nextInt(3);
}

public static void showStart() {
    System.out.println("Altitude: " + alt + " feet");
    System.out.println("Speed: " + spd + " knots");
    System.out.println("Wind Speed: " + wnd + " knots");

    if (turb == 0) System.out.println("Turbulence: None");
    else if (turb == 1) System.out.println("Turbulence: Light");
    else System.out.println("Turbulence: Heavy");
}
    public static void main(String[] args){
        
    }
}