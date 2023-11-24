package _access_modifier._pack02;

import _access_modifier._pack01.B;

public class C {

    B b;

    //C 클래스는 A, B 클래스와 패키지가 다르므로
    //default 제한자인 A 클래스는 불러올 수 없고,
    //public 제한자인 B 클래스는 불러올 수 있다.
}
