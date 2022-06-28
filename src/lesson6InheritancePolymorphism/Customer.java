package lesson6InheritancePolymorphism;

public class Customer extends User{
    private String customerBank;

    public Customer (String customerName, String customerRole, String customerBank){
        super(customerName, customerRole);
        this.customerBank = customerBank;
    }

    public String getCustomerBank() {
        return customerBank;
    }

    public void setCustomerBank(String customerBank) {
        this.customerBank = customerBank;
    }

    @Override
    public void showUserInfo(){
        System.out.println("User login is: " + getUserLogin() + " User role is: " + getUserRole() + " And the customer bank is: " + customerBank);
    }

    public void showUserRole(){
        System.out.println("My role is: " + getUserRole());
    }
}
