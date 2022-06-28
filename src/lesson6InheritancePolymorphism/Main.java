package lesson6InheritancePolymorphism;

public class Main {
    public static void main(String[] args) {

        //Создаем экземпляры разных классов
        User user1 = new User("Alex", "Guest");
        Customer customer1 = new Customer("John", "Customer", "SIB");
        Employee employee1 = new Employee("Nerd", "Emplyee", true);


        //Вызываем методы с одинаковым названием, но для разных экземпляров класса.Тестим @Override методы
        customer1.showUserInfo();
        user1.showUserInfo();
        employee1.showUserInfo();

        whatISUserRole(employee1);


    }

    //Создаем метод который показывает нам роль нашего экземпляра класса. Такой метод есть в каждом классе и в зависимости от того какой объект мы передадим в этот метод в Main классе - будет вызван один из этих методов (для одного из классов - в зависимости от того объект какого класса мы туда передадим)
    public static void whatISUserRole(User user){
        user.showUserRole();
    }
}
