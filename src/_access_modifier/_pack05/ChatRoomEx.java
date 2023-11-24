package _access_modifier._pack05;

public class ChatRoomEx {
    public static void main(String[] args) {
        ChatRoom c1 = new ChatRoom(1);
        ChatRoom c2 = new ChatRoom(2);


        c1.setTitle("잠을 잘 자는 법");
        System.out.printf("%s 방의 순서 : %d\n", c1.getTitle(), c1.getIndex());
        System.out.printf("%s 방의 순서 : %d\n", c2.getTitle(), c2.getIndex());
    }
}
