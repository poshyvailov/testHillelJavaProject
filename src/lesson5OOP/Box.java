package lesson5OOP;

public class Box {

    private int width;
    private int height;
    private int length;


    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int calculation(int width, int height, int length){
       int calculationResult = width * height * length;
       return calculationResult;
    }

}
