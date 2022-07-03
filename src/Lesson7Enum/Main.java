package Lesson7Enum;

public class Main {
    public static void main(String[] args) {

        //Cоздаем новый объект класса Users
        User user1 = new User(UsersTypes.GUEST, "Aleks001", "12345");
        User user2 = new User(UsersTypes.GUEST, "Aleks001", "2333");


        //Проверяем засетилось ли правильное значение из класса Enum в наш объект
        System.out.println(user1.usersTypes);


        //Вызывает переопределенный метод toString в котором мы читабельным языком выводим данные о нашем объекте
        user1.toString();
        checkIfObjectsHaveTheSameDataInside(user1, user2);

    }

    //Пишем метод куда передаем два объекта класса User и вызываем наш переопределенный метод equals. p.s. метод static чтобы можно было его вызывать без создания экземпляра класса
    public static void checkIfObjectsHaveTheSameDataInside(Object obj1, Object obj2){
        if(obj1.equals(obj2)){
            System.out.println("Objects are the same");
        } else {
            System.out.println("Objects are different");
        }
    }
}
