package Lesson7Enum;

public enum UsersTypes {
    //Наш Enum класс в котором мы добавили типы пользователей. Дополнительные интовые значения - не обязательные
    ADMIN(0),
    PREMIUM(1),
    AUTHORIZED(2),
    GUEST(3);

    private int prio;

    private UsersTypes(int prio){
        this.prio = prio;
    }

    public int getPrio() {
        return prio;
    }


}
