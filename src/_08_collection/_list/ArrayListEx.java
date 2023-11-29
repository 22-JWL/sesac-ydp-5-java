package _08_collection._list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {

        //List를 ArrayList라고 해도 되나 List로하는것이 범용성이 좋다.
        List<Book> list = new ArrayList<>();

        //객체 추가
        list.add(new Book("제목1", "지은이1"));
        list.add(new Book("제목2", "지은이2"));
        list.add(new Book("제목3", "지은이3"));
        list.add(new Book("제목4", "지은이4"));
        list.add(new Book("제목5", "지은이5"));

        int size = list.size();
        System.out.printf("총 %d 권의 책이 존재합니다.%n", size);

        //특정 인덱스 객체 가져오기
        Book thirdBook = list.get(2);
        System.out.println(thirdBook);

        //인덱스로 특정 객체 삭제
        list.remove(2);
        list.remove(2);
        System.out.println(list);

        //모든객체 가져오기
        for (Book b : list){
            System.out.println(b);

        }
        System.out.println();


        //모든 객체 삭제
        System.out.println("객체 빔?"+  list.isEmpty());
        list.clear();
        System.out.println("객체 빔?"+  list.isEmpty());
    }
}
