package lesson6InheritancePolymorphism;

public class Employee extends User{

    private boolean isEmplyee;

    public Employee(){

    }

    public Employee (String employeeName, String employeeRole, boolean isEmployee){
        super(employeeName, employeeRole);
        this.isEmplyee = isEmployee;
    }

    @Override
    public void showUserInfo(){
        System.out.println("User login is: " + getUserLogin() + " User role is: " + getUserRole() + " And am I employee? - " + isEmplyee );
    }

    public void showUserRole(){
        System.out.println("My role is: " + getUserRole());
    }
}
