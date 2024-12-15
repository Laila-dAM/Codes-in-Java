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



