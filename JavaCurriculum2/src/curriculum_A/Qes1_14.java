package curriculum_A;

public class Qes1_14 {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // 四則演算
        System.out.println("足し算: " + (a + b));
        System.out.println("引き算: " + (a - b));
        System.out.println("掛け算: " + (a * b));
        System.out.println("割り算: " + (a / b));
        System.out.println("あまり: " + (a % b));

        // 条件分岐
        if (a > b) {
            System.out.println("aはbより大きい");
        } else {
            System.out.println("aはb以下");
        }

        // 複合条件
        if (a > 0 && b > 0) {
            System.out.println("どちらも正の数です");
        }

        if (a == 10 || b == 10) {
            System.out.println("どちらかが10です");
        }
    }
}

