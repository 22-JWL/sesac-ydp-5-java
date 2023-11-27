package _05_class._abstract;

public class ShapeEx {
    public static void main(String[] args) {
        Circle c = new Circle("blue", 10);
//        Square s = new Square("yellow");

        c.start();
        c.draw();// 추상 메소드의 구현
        System.out.println("원의 색상은 " + c.getColor());



        printShape(c);
    }
    public static void printShape(Shape s) {
        System.out.println("==== " + s.type + "도형의 정보 ====");
        System.out.println("도형의 색상: " +s.color);
        System.out.println(s.calculateArea());
        System.out.println();


//        s.start();
//        s.draw();
//        System.out.println("사각형의 색상은 " + c.getColor());

    }
}
