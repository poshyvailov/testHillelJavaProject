package Lesson10Interfaces;

abstract class Animal {
    private String name;

    public Animal (){

    }

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
