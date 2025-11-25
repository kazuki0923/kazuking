package curriculum_D;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DaemonLoader {
    public static Character loadDaemon(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String name = br.readLine();
        int hp = Integer.parseInt(br.readLine());
        int at = Integer.parseInt(br.readLine());
        int sp = Integer.parseInt(br.readLine());
        br.close();
        return new Character(name, hp, at, sp);
    }
}