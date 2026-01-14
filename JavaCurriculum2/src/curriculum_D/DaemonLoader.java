package curriculum_D;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DaemonLoader {
    public static Character load(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String name = br.readLine();
            int hp = Integer.parseInt(br.readLine());
            int at = Integer.parseInt(br.readLine());
            int sp = Integer.parseInt(br.readLine());
            return new Character(name, hp, at, sp);
        } catch (IOException e) {
            System.out.println("Daemonの読み込みに失敗しました: " + e.getMessage());
            return null;
        }
    }
}