package oop.exam;

public class Rectangle {
    int x;
    int y;

    public int area(){
        return x * y;
    }

    public int round() {
        return x * 2 + y * 2;
    }

    public boolean isSquare() {
        return x == y;
    }
}
