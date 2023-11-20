package _02_controll_statement;

import java.util.Scanner;

public class Tesk {

    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


        int i = 1;
        while(i <= number) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();


    }
}
