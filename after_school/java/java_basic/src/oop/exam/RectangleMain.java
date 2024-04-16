package oop.exam;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rt = new Rectangle();
        rt.x = sc.nextInt();
        rt.y = sc.nextInt();

        System.out.println(rt.area());
        System.out.println(rt.round());
        System.out.println(rt.isSquare());
    }
}
