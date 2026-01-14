package curriculum_D;

import java.util.Random;
import java.util.Scanner;

public class PlayerFactory {
    public static Character createPlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Playerの名前を入力してください: ");
        String name = sc.nextLine();
        Random rand = new Random();
        int hp = rand.nextInt(51) + 50;  // 50〜100
        int at = rand.nextInt(11) + 5;   // 5〜15
        int sp = rand.nextInt(10) + 1;   // 1〜10
        return new Character(name, hp, at, sp);
    }
}