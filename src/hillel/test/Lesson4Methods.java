package hillel.test;

import java.nio.ShortBuffer;
import java.util.Scanner;

public class Lesson4Methods {

    public static void main(String[] args) {

//      Перегрузка методов
//      когда в одном классе есть несколько одинаковых методов но с разным набором параметров
//      ( мы меняем сигнатуру метода не за счет имени метода, а за счет его параметров ).
//      К примеру два метода - public static void “user” (String name, int age) и - public static void “user” (String car, int horsePower).
//      Зачем? - к примеру нам необходимо делать одни и те же действия в методе но с разными параметрами.
//      К примеру - public static void wash (String userHands) или public static void wash (String userCar) - действие оно и то же, алгоритм один и тот же, но входные параметры разные.
//      Моем мы разные вещи (алгоритм внутри метода так же может меняться при необходимости, но в целом результат метода один и тот же - что-то будет помыто - где-то будут чистые руки, а где-то чистая машина на выходе)


        Scanner scan = new Scanner(System.in);

        System.out.println("Please type what do you want to wash - hands or car ");
        String userInput = scan.next();

        if (userInput.equals("hands")) {
            System.out.println("Select what hand do you want to wash - right of left ");
            Scanner scanUserHand = new Scanner(System.in);
            String userHand = scanUserHand.nextLine();
            wash(userHand);
        } else if (userInput.equals("car")) {
            System.out.println("Please type your car model name ");
            Scanner scanCarName = new Scanner(System.in);
            String userCarName = scanCarName.nextLine();

            System.out.println("How much horses power does it have? ");
            Scanner scanHorsesPower = new Scanner(System.in);
            int userCarHorses = scanHorsesPower.nextInt();
            wash(userCarName, userCarHorses);
        } else {
            System.out.println("Wrong input data");
        }

    }

    public static void wash(String userHand) {
        System.out.println("You selected " + userHand + " hand and this hand is clean");
    }

    public static void wash(String userCar, int horsesPower) {
        System.out.println("Your car model is: " + userCar + " your car was added to our db and this car is clean now, also this car has " + horsesPower + " horses power and this data was added to our db");
    }
}
