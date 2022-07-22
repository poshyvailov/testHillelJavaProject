package Lesson9Collections;

public enum UserTypesEnum {
        ADMIN,
        PREMIUM,
        AUTHORIZED,
        GUEST;

        private int prio;


        public int getPrio() {
            return prio;
        }
}
