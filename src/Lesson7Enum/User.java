package Lesson7Enum;

public class User {
    UsersTypes usersTypes;

    public String login;
    public String password;

    public User (UsersTypes usersTypes, String login, String password){
        this.usersTypes = usersTypes;
        this.login = login;
        this.password = password;

    }
}
