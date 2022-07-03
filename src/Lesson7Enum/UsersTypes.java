package Lesson7Enum;

public enum UsersTypes {
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
