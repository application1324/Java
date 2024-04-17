package oop.exam;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rt = new Rectangle();
        rt.width = sc.nextInt();
        rt.height = sc.nextInt();

        System.out.println(rt.calculateArea());
        System.out.println(rt.calculateRound());
        System.out.println(rt.isSquare());
    }
}
