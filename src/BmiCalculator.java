// BMICalculator class is a utility class that's used to calculate the BMI value in both Imperial and Metric systems
public class BmiCalculator {

    // Please declare 4 attributes/properties to represent weight in pounds, height in inches, weight in kilos and height in meters
        double weightInPounds;
        double heightInInches;

        double weightInKilos;
        double heightInMeters;
    // Please use this default no arguments constructor to initialize the 4 properties to some initial values
    public BmiCalculator() {

        this.weightInKilos = 50.0;
        this.heightInMeters = 1.0;
        this.weightInPounds = 100.0;
        this.heightInInches = 50.0;


    }

    // Please implement the calculateBmiImperial() method to take in weight and height to calculate and return the BMI value in the Imperial system
    public static double calculateBmiImperial(double weight, double height) {

        return (703 * weight)/(height*height);

    }

    // Please implement the calculateBmiMetric() method to take in weight and height to calculate and return the BMI value in the Metric system
    public static double calculateBmiMetric(double weight , double height) {

        return weight/(height*height);

    }

    // Please implement the getBMICategory() method so that it takes the BMI value and returns the BMI category based on it
    public static String getBMICategory(double bmi) {

        if(bmi<18.5){
            return  "Underweight";
        } else if (bmi < 25) {
            return  "Normal weight";
        } else if (bmi < 30) {
            return  "Overweight";
        }else return "Obese";

    }

}
