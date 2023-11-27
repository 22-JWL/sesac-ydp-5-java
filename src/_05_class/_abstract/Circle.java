package _05_class._abstract;

public class Circle extends Shape{
    int radius;
    public Circle(String color, int radius){
        super(color, "원");// 부모 생성자 호출
        this.radius = radius;
    }
    double calculateArea() {
        return radius * radius* Math.PI;
    }

    public int getRadius() {
        return radius;
    }

    void draw() {
        System.out.println("사각형 그림ㅇㅇ");
    }
}
