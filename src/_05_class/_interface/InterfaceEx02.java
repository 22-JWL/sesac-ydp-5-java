package _05_class._interface;

interface Move {
    void moveForward();
    void moveBackward();
}

interface Power {
    void powerOn();
    void powerOff();

}

interface Car extends Move, Power{

    void changeGear(int gear);
}

class Suv implements Car{
    @Override
    public void moveForward() {
        System.out.println("후진");
    }

    @Override
    public void moveBackward() {
        System.out.println("전진");


    }

    @Override
    public void powerOn() {
        System.out.println("시동 On");


    }

    @Override
    public void powerOff() {
        System.out.println("시동 Off");


    }

    @Override
    public void changeGear(int gear) {
        System.out.printf("기어를 %d 로 변경 했습니다. %n", gear);


    }
}
public class InterfaceEx02 {
    public static void main(String[] args) {
        Suv mySuv = new Suv();
        mySuv.powerOn();
        mySuv.changeGear(4);
        mySuv.moveForward();
        mySuv.moveBackward();
        mySuv.powerOff();

    }
}
