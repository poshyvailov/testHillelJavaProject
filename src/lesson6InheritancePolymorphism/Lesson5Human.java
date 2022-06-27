package lesson6InheritancePolymorphism;

public class Lesson5Human {
    private int age;
    private String name;
    private int id;

    public Lesson5Human() {
    }

    public Lesson5Human(int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public void sayHello() {
        System.out.println("Hello. My age is: " + age + " my name is: " + name + " my id is: " + id);
    }



    //SETters and GETters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
