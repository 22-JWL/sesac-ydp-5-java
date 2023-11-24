package _05_class;

import java.util.Scanner;

public class RectangleEx {

    public static void main(String[] args) {
        System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        Rectangle rec = new Rectangle(width,height);
        System.out.println(rec.area());

    }
}
