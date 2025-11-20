package curriculum_C;

public class Player {
    private int hand; // 0:グー, 1:チョキ, 2:パー

    public void setHand(int hand) {
        this.hand = hand;
    }

    public int getHand() {
        return hand;
    }

    public String getHandName() {
        switch (hand) {
            case 0: return "グー";
            case 1: return "チョキ";
            case 2: return "パー";
            default: return "不明";
        }
    }
}