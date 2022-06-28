package lesson6InheritancePolymorphism;

public class User {
    private String userLogin;
    private String userRole;

    public User (){

    }

    public User (String userLogin, String userRole){
        this.userLogin = userLogin;
        this.userRole = userRole;
    }

    public void showUserInfo(){
        System.out.println("User login is: " + userLogin + " User role is: " + userRole);
    }

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
