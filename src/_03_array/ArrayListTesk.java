package _03_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListTesk {

    public static void main(String[] args) {
        List<String> arr1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean run = true;
        while (run){
            System.out.println("문자를 입력하세요");
            String text = sc.nextLine();
            if (text.equals("exit")){
                run = false;
            } else if (!text.equals("exit")) {
                arr1.add(text);
            }

        }
        for(String arr : arr1){
            System.out.println(arr);
        }
    }
}
