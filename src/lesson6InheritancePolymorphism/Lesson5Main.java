package lesson6InheritancePolymorphism;

public class Lesson5Main {
    public static void main(String[] args) {

        Lesson5Human human = new Lesson5Human(21, "Alex", 12345);
        Lesson5Student student = new Lesson5Student(23, "John", 12344, "Oxford");
        Lesson5Worker worker = new Lesson5Worker(33, "Michael", 123455, 3);

    }
}
