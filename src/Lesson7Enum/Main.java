package Lesson7Enum;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(UsersTypes.ADMIN, "Login123", "12345");
        System.out.println(user1.usersTypes);

    }
}
