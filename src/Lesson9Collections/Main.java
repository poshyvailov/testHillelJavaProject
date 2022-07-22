package Lesson9Collections;

import Lesson7Enum.User;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        //Пробуем HashSet коллекцию на примере простых объектов и выводим хэш код каждого объекта. Без оверрайда стандартного метода хеш кода
        HashSet<Users> usersCollection = new HashSet<>();
        usersCollection.add(new Users("Aleks", "email1", UserTypesEnum.ADMIN));
        usersCollection.add(new Users("Aleks2", "email2", UserTypesEnum.GUEST));
        usersCollection.add(new Users("fkasf", "asdasd3", UserTypesEnum.GUEST));
        usersCollection.add(new Users("Aleks3", "email4", UserTypesEnum.ADMIN));
        usersCollection.add(new Users("Aleks4", "email5", UserTypesEnum.GUEST));
        usersCollection.add(new Users("fkasf5", "asdas6", UserTypesEnum.GUEST));
        usersCollection.add(new Users("Aleks6", "email7", UserTypesEnum.ADMIN));
        usersCollection.add(new Users("Aleks7", "email8", UserTypesEnum.GUEST));
        usersCollection.add(new Users("fkasf8", "asdasd9", UserTypesEnum.GUEST));
        usersCollection.add(new Users("fkasf9", "asdasd10", UserTypesEnum.GUEST));

        for (Users user : usersCollection){
            System.out.println("userCollection item hash code is: " + user.hashCode());
        }


        //Самая простая и популятрная коллекция. Пробуем на простых стрингах
        ArrayList<String> someSimpleTestStringCollection = new ArrayList<>();

        someSimpleTestStringCollection.add("aTest");
        someSimpleTestStringCollection.add("fTest2");
        someSimpleTestStringCollection.add("bTest3");
        someSimpleTestStringCollection.add("wTest4");
        someSimpleTestStringCollection.add("cTest5");
        someSimpleTestStringCollection.add("dTest6");
        someSimpleTestStringCollection.add("yTest7");
        someSimpleTestStringCollection.add("zTest8");
        someSimpleTestStringCollection.add("wTest9");
        someSimpleTestStringCollection.add("rTest10");
        System.out.println(someSimpleTestStringCollection);

        //Пробуем коллекция с дефолтной сортировкой (для стринги - это по алфавиту)
        TreeSet<String> testLinkedList = new TreeSet(someSimpleTestStringCollection);
        System.out.println(testLinkedList);


    }
}

