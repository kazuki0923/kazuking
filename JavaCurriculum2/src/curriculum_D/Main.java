package curriculum_D;

public class Main {
    public static void main(String[] args) {
        try {
            Character player = PlayerFactory.createPlayer();
            Character daemon = DaemonLoader.loadDaemon("daemon_status.txt");
            Battle.start(player, daemon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}