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


//        //while
//        int userId = 0;
//        while (userId <= 100) {
//            System.out.println("Your user is is: " + userId);
//            userId++;
//        }
//
//
//
//        //do while
//        Scanner scan = new Scanner(System.in);
//        int count = 0;
//
//        do {
//            System.out.println("Your count is: " + count);
//            count++;
//        } while (count < 100);


//        //for
//        for (int a = 0; a <= 10; a++){
//            System.out.println("int a = " + a);
//        }
//        System.out.println("For is finished");


        //Факториал 5
        // 5! = 1 * 2 * 3 * 4 * 5 = 120
        // Факториал не может быть с 0
        // Факторил не может быть негативным


//        //Will generate random number from 0 to 1 DOUBLE
//        System.out.println(Math.random());
//        //Если мы хотим его преобразать к целому
//        System.out.println(Math.random() * 10);
//
//        //приобразовуем в целое int
//        int randomNumber = (int) (Math.random() * 10);
//        System.out.println(randomNumber);


//        int factorial = 5;
//        int fResult = 1;
//
//        for (int i = 1; i <= factorial; i++){
//            fResult  *= i;
//            System.out.println("Current result is: " + fResult);
//        }
//        System.out.println("Final factorial result is: " + fResult);


//        //Усложняем вычисление факториала рандомным числом
//        int factorial = (int)(Math.random() * 10);
//        System.out.println(factorial);
//        int fResult2 = 1;
//
//        for (int i = 1; i <= factorial; i++){
//            fResult2 *= i;
//            System.out.println("Current factorial is: " + fResult2);
//        }
//        System.out.println("Final factorial is: " + fResult2);


        // break and continue
        Scanner scan = new Scanner(System.in);

        for (int a = 0; a < 1; a++) {
            System.out.println("Do you waasnt to continue? Y/N");
            String userAnswer = scan.nextLine();

            if (userAnswer.equals("N")) {
                System.out.println("Bye! ");
                break;
            } else if (userAnswer.equals("Y")) {
                System.out.println("Thanks for staying with us! ");
            }
        }


}
}
