package _05_class;

import java.util.Scanner;

public class Rectangle{

    public int width;
    public int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void area(){

        Scanner scan = new Scanner(System.in);

        setWidth(scan.nextInt());
        setHeight(scan.nextInt());

        System.out.println("가로는 : " + getWidth());
        System.out.println("세로는 : " + getHeight());
        System.out.println("넓이는 : " + (width*height));
    }
}