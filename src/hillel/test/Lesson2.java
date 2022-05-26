package hillel.test;


import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type your mark to convert it ");
        int userMark = scanner.nextInt();

        if(userMark <= 0){
            System.out.println("Use values form 1 to 12!");
        } else if(userMark > 12){
            System.out.println("Use values form 1 to 12!");
        } else if (userMark == 12 || userMark == 11 || userMark == 10) {
            userMark = 5;
            System.out.println("Congratulation! Your marks is " + userMark);
        } else if (userMark == 9 || userMark == 8 || userMark == 7){
            userMark = 4;
            System.out.println("Your marks is " + userMark);
        } else if (userMark == 6 || userMark == 5 || userMark == 4 ){
            userMark = 3;
            System.out.println("Your marks is " + userMark);
        } else if (userMark == 3 || userMark == 2 || userMark == 1){
            userMark = 2;
            System.out.println("Your marks is " + userMark);
        } else {
            System.out.println("Wrong input data");
        }

    }


}
