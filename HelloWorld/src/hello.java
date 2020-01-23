import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("Hello Team!!");

        Scanner userInputs = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter weight in lbs: ");

        int weight = userInputs.nextInt(); // Read user input
        double weightKg = weight * 0.45359237;
        System.out.println("100 pounds is equal to " + weightKg + " kilograms.");
    }
}
