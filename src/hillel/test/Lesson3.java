package hillel.test;

import java.util.Random;
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


//        // break and continue
//        Scanner scan = new Scanner(System.in);
//
//        for (int a = 0; a < 1; a++) {
//            System.out.println("Do you waasnt to continue? Y/N");
//            String userAnswer = scan.nextLine();
//
//            if (userAnswer.equals("N")) {
//                System.out.println("Bye! ");
//                break;
//            } else if (userAnswer.equals("Y")) {
//                System.out.println("Thanks for staying with us! ");
//            }
//        }


//        //Using nested for
//        for (int i = 1; i <= 10; i++){
//            for (int j = 1; j <= 10; j++){
//                System.out.println(i + " * " + j + " = " + i * j);
//            }
//        }

//        //Using arrays
//
//        int age1 = 19;
//        int age2 = 22;
//        int age3 = 23;
//        int age4 = 33;
//        System.out.println((age1 + age2 + age3 + age4) / 4);
//
//        int[] ages = new int[4];
//        ages[0] = 19;
//        ages[1] = 22;
//        ages[2] = 23;
//        ages[3] = 33;


//        int[] ages = new int[4];
//
//        Random random = new Random();
//        int a = 18;
//        int b = 90;
//
//        for (int i = 0; i < ages.length; i++){
//            ages[i] = random.nextInt(b - a) ;
//            System.out.println(ages[i]);
//        }
//
////        System.out.println(50 - 100);
//
//        for(int var : ages){
//            System.out.println(ages[var]);
//        }


        Scanner userInput = new Scanner(System.in);
        int[] testArray;

        int firstNumber = 50;
        int secondNumber = 100;

        do {
            System.out.println("Type size of the array from 1 to 100");
            testArray = new int[userInput.nextInt()];
        } while (testArray.length < 1 || testArray.length > 100);

        System.out.println("testArray length is: " + testArray.length);

        Random random = new Random();

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = random.nextInt(secondNumber - firstNumber);
            System.out.println("Test array " + testArray[i]);
        }

        int max = getMax(testArray);
        System.out.println("Max value in the array is: " + max);


        int min = getMin(testArray);
        System.out.println("Min value in the array is: " + min);

        int average = getAverage(testArray);
        System.out.println("Average results is: " + average);

    }

    //Ищем максимальное значение
    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    //Ищем минималаьное значение
    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int j = 1; j < inputArray.length; j++) {
            if (inputArray[j] < minValue) {
                minValue = inputArray[j];
            }
        }
        return minValue;
    }

    //Ищем среднее
    private static int getAverage(int[] inputArray) {
        int middle = 0;
        for (int i = 0; i < inputArray.length; i++) {
            middle += inputArray[i];
        }
        int middleRes = middle / inputArray.length;
        return middleRes;
    }


    //Обратный перебор - с нуля до последнего элемента
//        for (int j = testArray.length - 1; j >= 0; j-- ){
//            System.out.println("Обратный: " + testArray[j]);
//        }

}
