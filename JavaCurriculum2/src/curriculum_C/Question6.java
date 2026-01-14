package curriculum_C;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player = new Player();
        Cpu cpu = new Cpu();

        System.out.println("じゃんけんゲーム開始！");
        System.out.println("グー(0), チョキ(1), パー(2) を入力してください");

        while (true) {
            System.out.print("入力: ");
            if (!sc.hasNextInt()) {
                System.out.println("数字を入力してください！");
                sc.next(); // 不正入力を捨てる
                continue;
            }

            int input = sc.nextInt();
            if (input < 0 || input > 2) {
                System.out.println("0～2の数字を入力してください！");
                continue;
            }

            player.setHand(input);
            cpu.setHand();

            System.out.println("あなたの手: " + player.getHandName());
            System.out.println("CPUの手: " + cpu.getHandName());

            // 勝敗判定
            if (player.getHand() == cpu.getHand()) {
                System.out.println("あいこです。もう一度！");
            } else if ((player.getHand() == 0 && cpu.getHand() == 1) ||
                       (player.getHand() == 1 && cpu.getHand() == 2) ||
                       (player.getHand() == 2 && cpu.getHand() == 0)) {
                System.out.println("あなたの勝ち！");
                break;
            } else {
                System.out.println("あなたの負け…もう一度！");
            }
        }

        sc.close();
    }
}