package Lesson7Enum;

public class User {
    UsersTypes usersTypes;
    public String login;
    public String password;

    public User(UsersTypes usersTypes, String login, String password) {
        this.usersTypes = usersTypes;
        this.login = login;
        this.password = password;
    }

    //Переопределяем стандартный метод toString класса Object чтобы для наших объектов класса Users выводилась читабельная информация при выхове метода
    @Override
    public String toString() {
        String result = "User name is " + login + " User password is: " + password + " And the user type is: " + usersTypes;
        return result;
    }

    //переопределяем метод equals класса Object чтобы изменить его стандартное поведение
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User that = (User) obj;
        if ((this.usersTypes == that.usersTypes) && (this.login.equals(that.login)) && (this.password.equals(that.password)))
            return true;
        //Если все ифы не выполняются то мы возвращаем false
        return false;
    }



}
