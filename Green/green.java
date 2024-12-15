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
