package oop.exam;

public class Rectangle {
    int width;
    int height;

    public int calculateArea(){
        return width * height;
    }

    public int calculateRound() {
        return width * 2 + height * 2;
    }

    public boolean isSquare() {
        return width == height;
    }
}
