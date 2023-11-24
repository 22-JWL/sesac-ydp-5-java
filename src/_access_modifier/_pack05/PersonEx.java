package _access_modifier._pack05;

public class PersonEx {
    public static void main(String[] args) {
        Person p1 = new Person("Ethan");
        Person p2 = new Person("pooh");

//        p1.age = 5;// age 필드는 private 선언했기에 직접 변경 불가능
//        -> setter 이용해 값을 변경해야 함
        p1.setAge(5);
        System.out.printf("%s 의 나이 : %d", p1.getName(), p1.getAge());


        p2.setAge(-6);
        System.out.printf("%s 의 나이 : %d", p2.getName(), p2.getAge());
    }
}
