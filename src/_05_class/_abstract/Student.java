package _05_class._abstract;

public abstract class Student {

    //필드 선언
    String name;
    String school;
    int age;
    int stdnum;

    public Student(String name, String school, int age, int stdnum){
        this.name = name;
        this.school =school;
        this.age = age;
        this.stdnum = stdnum;

    }

    abstract void todo();

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public int getAge() {
        return age;
    }

    public int getStdnum() {
        return stdnum;
    }
}
