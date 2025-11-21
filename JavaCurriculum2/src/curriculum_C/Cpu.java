package curriculum_C;

import java.util.Random;

public class Cpu {
    private Random rand = new Random(); // 1度だけ生成
    private int hand;

    public void setHand() {
        this.hand = rand.nextInt(3); // 0～2
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