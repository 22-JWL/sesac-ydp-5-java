package _05_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RectangleEx {

    public static void main(String[] args){
        boolean run = true;
        Scanner scan = new Scanner(System.in);
        List<Rectangle> rect = new ArrayList<>();

        while(run){
            System.out.println("사각형의 길이를 세로와 가로로 띄어쓰기 로 구분하여 입력하시오");
            Rectangle rect1 = new Rectangle(scan.nextInt(), scan.nextInt());
            if(rect1.getWidth() == 0 && rect1.getHeight() == 0) {
                for(Rectangle texts : rect){
                    System.out.println("가로는 : " + texts.getWidth());
                    System.out.println("세로는 : " + texts.getHeight());
                    System.out.println("넓이는 : " + (texts.getWidth()* texts.getHeight()));
                    System.out.println("-------------------");
                }
                run = false;
            } else {
                rect.add(rect1);
            }
        }

        System.out.println("------ 인스턴스의 개수는 : " + rect.size());


    }
}
