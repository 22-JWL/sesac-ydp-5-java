package _05_class._interface;

public interface RemoteControl {
    //추상 메소드
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    //상수 필드
    int MAX_VOLUME = 10;

    int MIN_VOLUME = 0;
}
