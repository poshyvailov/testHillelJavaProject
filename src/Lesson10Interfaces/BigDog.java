package Lesson10Interfaces;

public class BigDog extends Dog {

    BigDog(String name){
        super(name);
    }

    public void greets(){
        System.out.println("Woow");
    }

    public void greets(Dog anotherDog){
        System.out.println("Woooow");
    }

    public void greets(BigDog anotherBigDog){
        System.out.println("Woooooooooooooow");
    }
}
