package _02_controll_statement;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class MethodTask {

    public static void main(String[] args) {
        System.out.println("숫자 두 개를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();


        System.out.println("덧셈 결과" + add(num1, num2));
        System.out.println("뺄셈 결과" + min(num1, num2));
        System.out.println("나눗셈 결과" + div(num1, num2));
        System.out.println("곱셈 결과" + mul(num1, num2));





        System.out.println("반지름이 5인 원의 넓이 : "+ space(5));
        System.out.println("가로 4, 세로 7인 직사각형의 넓이 : "+ space(4, 7));
        System.out.println("밑변 6, 높이 3인 삼각형의 넓이 : "+ space(6, 3, 2));

    }

    public static double add(int x, int y){
        return x+y;
    }
    public static double min(int x, int y){
        return x-y;
    }
    public static double mul(int x, int y){
        return x*y;
    }
    public static float div(int x, int y){
        return x/y;
    }


    public static double space(int radius){
        return Math.pow(radius, 2)* Math.PI;
    }
    public static double space(int width, int height){
        return width*height;
    }
    public static double space(int width, int height, int z ){
        return width*height/z;
    }
}
