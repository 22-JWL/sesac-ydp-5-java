//메인 클래스 (시작 클래스) 정의
// - main 메서드 가짐
// - 메인 클래스는 한 개!(node에서 진입점 파일 역할)
public class Main {//SesacStudent

    //main 메소드
    // - 자바 응용 프토그램의 실행 시작점
    // - 애플리케이션이 실행되려면 최소 1개 존재해야 함
    // - JVM 은 세미콜론으로 끝나는 문장을 하나의 명령문으로 인식
    public static void main(String[] args) {

        System.out.print("Java Study Start!" + "haha");
        System.out.println("Yeah");
        System.out.printf("Hello and welcome!");




        for (int i = 1; i <= 10; i++) {

            System.out.println("i = " + i);
        }
    }
}