package Lesson9Collections;

import Lesson7Enum.UsersTypes;

public class Users {
    private String userName;
    private String userEmail;

     UserTypesEnum userTypesEnum;


    public Users (String userNane, String userEmail, UserTypesEnum userTypesEnum){
        this.userName = userNane;
        this.userEmail = userEmail;
        this.userTypesEnum = userTypesEnum;

    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
