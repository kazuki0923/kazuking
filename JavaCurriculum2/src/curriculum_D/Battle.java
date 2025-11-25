package curriculum_D;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Battle {
    public static void start(Character player, Character daemon) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("battle_log.txt"));

        Character attacker, defender;
        if (player.sp > daemon.sp || (player.sp == daemon.sp && new Random().nextBoolean())) {
            attacker = player;
            defender = daemon;
        } else {
            attacker = daemon;
            defender = player;
        }

        bw.write("Battle Start!\n");
        bw.write(player.name + " vs " + daemon.name + "\n");

        while (player.isAlive() && daemon.isAlive()) {
            attacker.attack(defender);
            bw.write(attacker.name + " attacks " + defender.name + " for " + attacker.at + " damage. "
                    + defender.name + " HP: " + defender.hp + "\n");

            // ターン交代
            Character temp = attacker;
            attacker = defender;
            defender = temp;
        }

        String winner = player.isAlive() ? player.name : daemon.name;
        bw.write("Winner: " + winner + "\n");
        bw.close();

        System.out.println("Battle finished! Winner: " + winner);
    }
}