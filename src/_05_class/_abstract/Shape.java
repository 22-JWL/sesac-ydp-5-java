package _05_class._abstract;


//추상클래스
public abstract class Shape {

    //필드 선언

    String color;
    String type;

    //생성자 선언
    public Shape(String color, String type){
        this.color = color;
        this.type = type;
    }

    //추상 메소드 선언
    // - abstract 키워드 사용
    // - 선언만 하고, 구현은 하지 않은 메소드
    // - 중괄호 없음
    // -

    abstract void draw();

    abstract double calculateArea();

    //일반 메소드
    void start() {
        System.out.println("도형 그리자");
    }

    public String getColor() {
        return color;
    }
}
