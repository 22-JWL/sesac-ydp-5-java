package _access_modifier._pack05;

public class ChatRoom {

    private String title = "빈 타이틀";
    private int index;



    public ChatRoom(int index) {
        this.index = index;

    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
