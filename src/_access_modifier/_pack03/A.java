package _access_modifier._pack03;


//필드와 메소드의 접근 제어자
public class A {

    public int field1;

    int field2; // default field
    private int  field3; // private field

    //constructor
    public A() {

        field1 =1;
        field2 =2;
        field3 =3;

        method1();
        method2();
        method3();
    }


    public void method1() {}

    void method2() {}

    private void method3() {}



}
