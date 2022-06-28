package lesson6InheritancePolymorphism;

public class Employee extends User{

    private boolean isEmplyee;

    //Создаем базоввый конструктор
    public Employee(){

    }

    //СОздаем конутруктор в котором вызываем подходящий нам конструктор класса User + доавляем уникальное поле для нашего класса - isEmployee
    public Employee (String employeeName, String employeeRole, boolean isEmployee){
        super(employeeName, employeeRole);
        this.isEmplyee = isEmployee;
    }

    // Создаем метод который показывает инфу по базовым полям класса User - нашего базового класса + добавляем инфу по полю шsEmployee
    @Override
    public void showUserInfo(){
        System.out.println("User login is: " + getUserLogin() + " User role is: " + getUserRole() + " And am I employee? - " + isEmplyee );
    }

    //Создаем метод который показывает нам роль нашего экземпляра класса. Такой метод есть в каждом классе и в зависимости от того какой объект мы передадим в этот мето в Main классе - будет вызван один из этих методов (для одного из классов - в зависимости от того объект какого класса мы туда передадим)
    public void showUserRole(){
        System.out.println("My role is: " + getUserRole());
    }
}
