package Lesson10Interfaces;

public class Wolf extends Animal implements WildAnimal {

    Wolf(String name){
        super(name);
    }

    public void greets(){
        System.out.println("Wolf " + getName() + " says Hawoo");
    }

    @Override
    public void hunting(){
        System.out.println("Wolf " + getName() + " goes hunting");
    }
}
