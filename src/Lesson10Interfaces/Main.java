package Lesson10Interfaces;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Alex");
        Dog dog1 = new Dog("Muhtar");
        Lion lion1 = new Lion("Simba");
        Wolf wolf1 = new Wolf("First");
        BigDog bigDog1 = new BigDog("Big Bob");

        System.out.println("Methods for Cat: ");
        cat1.greets();
        cat1.walk();
        cat1.feed();
        cat1.play();

        System.out.println("Methods for Dog: ");
        dog1.greets();
        dog1.greets(dog1);
        dog1.walk();
        dog1.feed();
        dog1.play();

        System.out.println("Methods for Lion: ");
        lion1.greets();
        lion1.hunting();

        System.out.println("Methods for wold: ");
        wolf1.greets();
        wolf1.hunting();

        System.out.println("Methods for big dog: ");
        bigDog1.greets();
        bigDog1.greets(dog1);
        bigDog1.greets(bigDog1);

    }
}
