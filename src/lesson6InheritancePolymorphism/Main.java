package lesson6InheritancePolymorphism;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Alex", "Guest");
        Customer customer1 = new Customer("John", "Customer", "SIB");
        Employee employee1 = new Employee("Nerd", "Emplyee", true);


        customer1.showUserInfo();
        user1.showUserInfo();
        employee1.showUserInfo();

        whatISUserRole(user1);


    }

    public static void whatISUserRole(User user){
        user.showUserRole();
    }
}
