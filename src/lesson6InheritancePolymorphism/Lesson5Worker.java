package lesson6InheritancePolymorphism;

public class Lesson5Worker extends Lesson5Human {
    private int workerLevel;

    public Lesson5Worker() {
    }


    public Lesson5Worker(int age, String name, int id, int workerLevel) {
        super(age, name, id);
        this.workerLevel = workerLevel;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello. My age is: " + getAge() + " my name is: " + getName() + " my id is: " + getId() + " and my worker level is: " + workerLevel);
    }
}
