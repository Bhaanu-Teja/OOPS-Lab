import java.util.Scanner;

class Crop {
    private String name;
    private String suitableSoil;
    private String suitableWeather;
    private double pricePerTon;
    private double yieldPerAcre;

    public Crop(String name, String suitableSoil, String suitableWeather, double pricePerTon, double yieldPerAcre) {
        this.name = name;
        this.suitableSoil = suitableSoil;
        this.suitableWeather = suitableWeather;
        this.pricePerTon = pricePerTon;
        this.yieldPerAcre = yieldPerAcre;
    }

    public String getName() {
        return name;
    }

    public String getSuitableSoil() {
        return suitableSoil;
    }

    public String getSuitableWeather() {
        return suitableWeather;
    }

    public double getPricePerTon() {
        return pricePerTon;
    }

    public double getYieldPerAcre() {
        return yieldPerAcre;
    }

    public double calculateProfit(double farmSize) {
        return farmSize * yieldPerAcre * pricePerTon;
    }
}

public class Agriculture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define crops
        Crop[] crops = {
                new Crop("Wheat", "Loamy", "Moderate", 200, 2.5),
                new Crop("Rice", "Clayey", "Wet", 300, 3.0),
                new Crop("Corn", "Sandy", "Hot", 250, 2.8),
                new Crop("Soybean", "Loamy", "Moderate", 220, 2.6)
        };

        // Get user input
        System.out.print("Enter soil type (Loamy/Clayey/Sandy): ");
        String soilType = scanner.nextLine();

        System.out.print("Enter weather condition (Moderate/Wet/Hot): ");
        String weatherCondition = scanner.nextLine();

        System.out.print("Enter farm size (in acres): ");
        double farmSize = scanner.nextDouble();

        boolean foundCrop = false;
        System.out.println("\n### Suitable Crops and Expected Profit ###");

        // Check suitable crops
        for (Crop crop : crops) {
            if (crop.getSuitableSoil().equalsIgnoreCase(soilType) && crop.getSuitableWeather().equalsIgnoreCase(weatherCondition)) {
                System.out.println("Crop: " + crop.getName() + ", Expected Profit: $" + crop.calculateProfit(farmSize));
                foundCrop = true;
            }
        }

        // If no suitable crop is found
        if (!foundCrop) {
            System.out.println("No suitable crops found for the given soil and weather conditions.");
        }

        scanner.close();
    }
}
