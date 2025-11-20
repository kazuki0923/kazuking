package curriculum_C;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player = new Player();
        Cpu cpu = new Cpu();

        boolean win = false;

        while (!win) {
            System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
            int hand = sc.nextInt();

            player.setHand(hand);
            cpu.setRandomHand();

            System.out.println("あなたの手: " + player.getHandName());
            System.out.println("CPUの手: " + cpu.getHandName());

            int result = judge(player.getHand(), cpu.getHand());

            if (result == 0) {
                System.out.println("あいこです。もう一度！");
            } else if (result == 1) {
                System.out.println("あなたの勝ち！");
                win = true;
            } else {
                System.out.println("あなたの負け…もう一度挑戦！");
            }
        }
        sc.close();
    }

    // 勝敗判定メソッド
    public static int judge(int player, int cpu) {
        if (player == cpu) return 0; // あいこ
        if ((player == 0 && cpu == 1) || (player == 1 && cpu == 2) || (player == 2 && cpu == 0)) {
            return 1; // プレイヤー勝ち
        }
        return -1; // プレイヤー負け
    }
}