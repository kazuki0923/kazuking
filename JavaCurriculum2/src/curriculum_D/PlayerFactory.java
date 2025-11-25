package curriculum_D;

import java.util.Random;
import java.util.Scanner;

public class PlayerFactory {
    public static Character createPlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Player name: ");
        String name = sc.nextLine();

        Random rand = new Random();
        int hp = 70 + rand.nextInt(31); // 70〜100
        int at = 10 + rand.nextInt(6);  // 10〜15
        int sp = 5 + rand.nextInt(6);   // 5〜10

        return new Character(name, hp, at, sp);
    }
}