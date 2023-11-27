package _05_class._abstract;

public class StudentEx {
    public static void main(String[] args) {
        Kim kim = new Kim("김철수", "동성 고등학교", 17,20220001);
        Baek baek = new Baek("박영희", "용문 고등학교", 18, 20210002);

        System.out.printf("===== %s 학생의 정보 ====\n", kim.getName());
        System.out.printf("학교 : %s\n", kim.getSchool());
        System.out.printf("나이 : %s\n", kim.getAge());
        System.out.printf("학교 : %s\n", kim.getStdnum());
        kim.todo();
        
        System.out.println();

        System.out.printf("===== %s 학생의 정보 ====\n", baek.getName());
        System.out.printf("학교 : %s\n", baek.getSchool());
        System.out.printf("나이 : %s\n", baek.getAge());
        System.out.printf("학교 : %s\n", baek.getStdnum());
        baek.todo();
    }
}
