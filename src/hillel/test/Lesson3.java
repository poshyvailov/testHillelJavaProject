package hillel.test;

import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {


//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Please type your number from 1 to 10");
//
//        while (!scan.hasNextInt()) {
//            System.out.println("Type number value");
//        }
//
//
//        if(!scan.hasNextInt()){
//            System.out.println("Type number value");
//        }


        //Validation of the input data from the Scanner
//        int customerNumber = 6;
//        System.out.println("Please enter your number and guess what number is correct ");
//        Scanner sc = new Scanner(System.in);
//
//        if (sc.hasNextInt()) {
//            customerNumber = sc.nextInt();
//            if (customerNumber == 6) {
//                System.out.println("Congratulation! Correct number is: 6");
//            } else if (customerNumber != 6){
//                System.out.println("Try again");
//            }
//        } else {
//            System.out.println("Use only integer values!");
//        }


        //while
        int userId = 0;
        while (userId <= 100) {
            System.out.println("Your user is is: " + userId);
            userId++;
        }

        //do while
        Scanner scan = new Scanner(System.in);
        int count = 0;

        do {
            System.out.println("Your count is: " + count);
            count++;
        } while (count < 100);


    }
}
