package hillel.test;


import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {

        // For

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please type your mark to convert it ");
//        int userMark = scanner.nextInt();
//
//        if(userMark <= 0){
//            System.out.println("Use values form 1 to 12!");
//        } else if(userMark > 12){
//            System.out.println("Use values form 1 to 12!");
//        } else if (userMark == 12 || userMark == 11 || userMark == 10) {
//            userMark = 5;
//            System.out.println("Congratulation! Your marks is " + userMark);
//        } else if (userMark == 9 || userMark == 8 || userMark == 7){
//            userMark = 4;
//            System.out.println("Your marks is " + userMark);
//        } else if (userMark == 6 || userMark == 5 || userMark == 4 ){
//            userMark = 3;
//            System.out.println("Your marks is " + userMark);
//        } else if (userMark == 3 || userMark == 2 || userMark == 1){
//            userMark = 2;
//            System.out.println("Your marks is " + userMark);
//        } else {
//            System.out.println("Wrong input data");
//        }


        //CASE for several events with different bodies for each case

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please type your mark to convert it ");
//        int userMark = scanner.nextInt();
//
//        if (userMark <= 0 || userMark > 12) {
//            System.out.println("Use values from 1 to 12! ");
//        } else
//            switch (userMark) {
//                case 12: {
//                    userMark = 5;
//                    System.out.println("Congratulation! Your mark is " + userMark);
//                    break;
//                }
//                case 11: {
//                    userMark = 5;
//                    System.out.println("Congratulation! Your mark is " + userMark);
//                    break;
//                }
//                case 10: {
//                    userMark = 5;
//                    System.out.println("Congratulation! Your mark is " + userMark);
//                    break;
//                }
//                case 9: {
//                    userMark = 4;
//                    System.out.println("Your mark is " + userMark);
//                    break;
//                }
//                case 8: {
//                    userMark = 4;
//                    System.out.println("Your mark is " + userMark);
//                    break;
//                }
//                case 7: {
//                    userMark = 4;
//                    System.out.println("Your mark is " + userMark);
//                    break;
//                }
//                case 6: {
//                    userMark = 3;
//                    System.out.println("Your mark is " + userMark);
//                    break;
//                }
//                case 5: {
//                    userMark = 3;
//                    System.out.println("Your mark is " + userMark);
//                    break;
//                }
//                case 4: {
//                    userMark = 3;
//                    System.out.println("Your mark is " + userMark);
//                    break;
//                }
//                case 3: {
//                    userMark = 2;
//                    System.out.println("Your mark is " + userMark);
//                    break;
//                }
//                case 2: {
//                    userMark = 2;
//                    System.out.println("Your mark is " + userMark);
//                    break;
//                }
//                case 1: {
//                    userMark = 2;
//                    System.out.println("Your mark is " + userMark);
//                    break;
//                }
//                default: {
//                    System.out.println("Wrong value! ");
//                }
//            }


        //CASE for several events with one body

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type your mark to convert it ");


        int userMark = scanner.nextInt();


        if (userMark <= 0 || userMark > 12) {
            System.out.println("Use values from 1 to 12! ");
        } else
            switch (userMark) {
                case 12:
                case 11:
                case 10: {
                    userMark = 5;
                    System.out.println("Congratulation! Your mark is " + userMark);
                    break;
                }
                case 9:
                case 8:
                case 7: {
                    userMark = 4;
                    System.out.println("Your mark is " + userMark);
                    break;
                }
                case 6:
                case 5:
                case 4: {
                    userMark = 3;
                    System.out.println("Your mark is " + userMark);
                    break;
                }
                case 3:
                case 2:
                case 1: {
                    userMark = 2;
                    System.out.println("Your mark is " + userMark);
                    break;
                }
                default: {
                    System.out.println("Wrong value! ");
                }
            }

        //anotherOperatorLikeIf
        int userAge = 20;
        String if_userShouldHAveAccess = userAge >= 18 && userAge < 100 ? "Welcome" : "Wrong age, access denied";
        System.out.println(if_userShouldHAveAccess);
    }

}
