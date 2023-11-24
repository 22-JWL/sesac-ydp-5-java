package _05_class;

public class StudentEx {
    public static void main(String[] args) {
        // std1 변수가 Student 객체 참조
        Student std1 = new Student("이은지", 20231001, 1);
        Student std2 = new Student("김새싹", 20231002, 2);
        Student std3 = new Student("박지은", 202231003, 3);

        displayInfo(std1);
        displayInfo(std2);
        displayInfo(std3);
        System.out.println("총 학생 수는 "+ Student.totalStudents+"명 입니다.");
    }

    private static void displayInfo(Student std){
        System.out.println("=== 학생 정보 ===");
        System.out.println("이름: " + std.name);
        System.out.println("학번: " + std.student_ID);
        System.out.println("학녕: " + std.grade);
        System.out.println();
    }
}