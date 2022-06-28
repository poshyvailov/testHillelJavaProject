package lesson6InheritancePolymorphism;

public class Customer extends User{
    private String customerBank;

    //Создаем конструктор класса Customer который наследуется от класса User. Тут в теле конструктора мы вызываем подходящий нам конструктор класса Users чтобы не дубоировать код
    public Customer (String customerName, String customerRole, String customerBank){
        super(customerName, customerRole);
        this.customerBank = customerBank;
    }

    //Создаем геттер чтобы в других классах можно было получить инфу по названию банка кастомера
    public String getCustomerBank() {
        return customerBank;
    }

    //Создаем сеттер чтобы можно было поменять название банка для нашего экземпляра в другом классе
    public void setCustomerBank(String customerBank) {
        this.customerBank = customerBank;
    }

    //Создаем метод который показывает инфу по базовым полям класса User - нашего базового класса + наше дополнительное поле customerBank. Пользуемся сеттерами и геттерами чтобы вытянуть данные полей из класса User
    @Override
    public void showUserInfo(){
        System.out.println("User login is: " + getUserLogin() + " User role is: " + getUserRole() + " And the customer bank is: " + customerBank);
    }

    //Создаем метод который показывает нам роль нашего экземпляра класса. Такой метод есть в каждом классе и в зависимости от того какой объект мы передадим в этот мето в Main классе - будет вызван один из этих методов (для одного из классов - в зависимости от того объект какого класса мы туда передадим)
    public void showUserRole(){
        System.out.println("My role is: " + getUserRole());
    }
}
