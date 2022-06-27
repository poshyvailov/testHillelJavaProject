package lesson6InheritancePolymorphism;

public class Lesson5Student extends Lesson5Human {

    private String university;

    public Lesson5Student() {
    }


    public Lesson5Student(int age, String name, int id, String university) {
        super(age, name, id);
        this.university = university;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello. My age is: " + getAge() + " my name is: " + getName() + " my id is: " + getId() + " and my university is: " + university);
    }
}
