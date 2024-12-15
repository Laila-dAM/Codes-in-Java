import java.util.ArrayList;
import java.util.Scanner;

class Plant {
    String name;
    String type;
    int idealGrowthTime; 
    public Plant(String name, String type, int idealGrowthTime) {
        this.name = name;
        this.type = type;
        this.idealGrowthTime = idealGrowthTime;
    }
 public String getInfo() {
        return name + " (" + type + ") - Ideal Growth Time: " + idealGrowthTime + " days";
    }
}

class Greenhouse {
    double temperature;
    double humidity;
    double lightIntensity;

    public Greenhouse(double temperature, double humidity, double lightIntensity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.lightIntensity = lightIntensity;
    }
    
    public void adjustEnvironment(double temperature, double humidity, double lightIntensity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.lightIntensity = lightIntensity;
    }
    
    public void checkEnvironment() {
        if (temperature < 18 || temperature > 30) {
            System.out.println("Warning: Temperature out of optimal range (18-30°C)!");
        }
        if (humidity < 40 || humidity > 80) {
            System.out.println("Warning: Humidity out of optimal range (40-80%)!");
        }
    }


    public int calculateGrowthTime(Plant plant) {
        int growthTime = plant.idealGrowthTime;

        if (temperature < 18 || temperature > 30) {
            growthTime += 2;
        }
        if (humidity < 40 || humidity > 80) {
            growthTime += 3;
        }
        return growthTime;
    }
}
public class SmartGreenhouseSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Plant> plants = new ArrayList<>();
        Greenhouse greenhouse = new Greenhouse(25, 60, 80);

        System.out.println("Smart Greenhouse Plant Growth Simulator");
        
while(true) {
    System.out.println("Choose an option:");
    System.out.println("1. Add a new plant");
    System.out.println("2. Adjust greenhouse environment");
    System.out.println("3. View plant info and estimated growth time");
    System.out.println("4. Exit");
}


