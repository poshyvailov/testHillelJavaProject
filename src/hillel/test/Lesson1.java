package hillel.test;

import java.util.Scanner;

public class Lesson1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Hello! Please type your weight ");
        double weight = scanner.nextDouble();

        System.out.println("Please type your hight in meters ");
        double height = scanner.nextDouble();


        System.out.println("Your index is: " + calculatingIndex(height, weight));
    }

    private static double calculatingIndex(double userHeight, double userWeight) {
        double calculatedData = userWeight / (userHeight * 2);
        return calculatedData;
    };

}
