package _access_modifier._pack04;

import _access_modifier._pack03.A;

public class C {


    public void method() {
        A a = new A();


        //필드 변경
        a.field1 =111;
//        a.field2 =222; default field 이므로 X
//        a.field3 =333;

        //메소드 호출
        a.method1();
//        a.method2();//default method 이므로 X
//        a.method3();

    }
}
