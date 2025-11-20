package curriculum_C;

import java.util.Random;

public class Cpu {
    private int hand;

    public void setRandomHand() {
        Random rand = new Random();
        this.hand = rand.nextInt(3); // 0〜2の乱数
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