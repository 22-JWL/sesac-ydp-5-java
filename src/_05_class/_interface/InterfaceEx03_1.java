package _05_class._interface;

public class InterfaceEx03_1 {
    public static void main(String[] args) {

        Music m;
        m = new Mp3Player();
        m.getMusic("NewJeans - Attention");
        System.out.println("=== MP3 Player ===");
        m.play();
        m.stop();

        m = new CdPlayer();
        m.getMusic("NewJeans - OMG");
        System.out.println("=== CD Player ===");
        m.play();
        m.stop();

    }




}
