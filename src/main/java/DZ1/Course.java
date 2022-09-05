package DZ1;

public class Course {
    Obstacle[] obstacles;
    String name;

    public Course(Obstacle[] obstacles, String name) {
        this.obstacles = obstacles;
        this.name = name;
    }

    public void doIt(Team team) {
        Player[] players = team.players;
        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                players[i].stamina = players[i].stamina - obstacles[j].complexity;
            }
        }

    }

}
