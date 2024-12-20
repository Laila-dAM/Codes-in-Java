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
    
}