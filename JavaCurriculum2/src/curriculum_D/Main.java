package curriculum_D;

public class Main {
    public static void main(String[] args) {
        Character player = PlayerFactory.createPlayer();
        Character daemon = DaemonLoader.load("daemon_status.txt");
        if (daemon != null) {
            Battle.start(player, daemon);
        }
    }
}