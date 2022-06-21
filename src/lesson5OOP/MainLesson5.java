package lesson5OOP;

public class MainLesson5 {
    public static void main(String[] args) {


        Box box1 = new Box(12, 15, 23);
        Box box2 = new Box(14, 16, 23);
        Box box3 = new Box(14, 23, 24);
        Box box4 = new Box(15, 21, 23);
        Box box5 = new Box(11, 25, 21);


        System.out.println(box1.calculation(box1.getWidth(),box1.getHeight(), box1.getLength()));
        System.out.println(box2.calculation(box2.getWidth(),box2.getHeight(), box2.getLength()));
        System.out.println(box3.calculation(box3.getWidth(),box3.getHeight(), box3.getLength()));
        System.out.println(box4.calculation(box4.getWidth(),box4.getHeight(), box4.getLength()));
        System.out.println(box5.calculation(box5.getWidth(),box5.getHeight(), box5.getLength()));
    }
}
