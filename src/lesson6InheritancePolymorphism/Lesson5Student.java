package lesson6InheritancePolymorphism;

public class Lesson5Student extends Lesson5Human {

    private String university;

    public Lesson5Student() {
    }


    public Lesson5Student(int age, String name, int id, String university) {
        super(age, name, id);
        this.university = university;
    }
}
