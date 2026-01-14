package curriculum_D;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Battle {
    public static void start(Character player, Character daemon) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("battle_log.txt"))) {
            bw.write("=== Battle Start ===\n");
            bw.write(player.getName() + " (HP:" + player.getHp() + ", AT:" + player.getAt() + ", SP:" + player.getSp() + ")\n");
            bw.write(daemon.getName() + " (HP:" + daemon.getHp() + ", AT:" + daemon.getAt() + ", SP:" + daemon.getSp() + ")\n\n");

            Character attacker, defender;
            if (player.getSp() > daemon.getSp()) {
                attacker = player;
                defender = daemon;
            } else if (player.getSp() < daemon.getSp()) {
                attacker = daemon;
                defender = player;
            } else {
                attacker = new Random().nextBoolean() ? player : daemon;
                defender = (attacker == player) ? daemon : player;
            }
            bw.write("先攻は " + attacker.getName() + " です！\n\n");

            while (player.getHp() > 0 && daemon.getHp() > 0) {
                int damage = attacker.attack(defender);
                bw.write(attacker.getName() + " の攻撃！ " + defender.getName() + " に " + damage + " ダメージ！\n");
                bw.write(defender.getName() + " の残りHP: " + defender.getHp() + "\n\n");

                if (defender.getHp() <= 0) break;

                Character temp = attacker;
                attacker = defender;
                defender = temp;
            }

            String winner = (player.getHp() > 0) ? player.getName() : daemon.getName();
            bw.write("=== 勝者: " + winner + " ===\n");
        } catch (IOException e) {
            System.out.println("ログ出力に失敗しました: " + e.getMessage());
        }
    }
}