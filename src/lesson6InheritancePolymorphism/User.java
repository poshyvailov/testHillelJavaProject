package lesson6InheritancePolymorphism;

public class User {
    private String userLogin;
    private String userRole;

    //Создаем базовый, пустой конструктор
    public User (){

    }

    //Создаем конструктор дла User класса
    public User (String userLogin, String userRole){
        this.userLogin = userLogin;
        this.userRole = userRole;
    }

    //Создаем метод который показывает инфу по базовым полям класса User - нашего базового класса
    public void showUserInfo(){
        System.out.println("User login is: " + userLogin + " User role is: " + userRole);
    }

    //Создаем метод который показывает нам роль нашего экземпляра класса. Такой метод есть в каждом классе и в зависимости от того какой объект мы передадим в этот мето в Main классе - будет вызван один из этих методов (для одного из классов - в зависимости от того объект какого класса мы туда передадим)
    public void showUserRole(){
        System.out.println("My role is: " + userRole);
    }



    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}
