package DZ1;

public class Main {
    public static void main(String[] args) {

        Player[] players = new Player[4];
        players[0] = new Player("Ivanov",100);
        players[1] = new Player("Petrov", 50);
        players[2] = new Player("Sidorov", 75);
        players[3] = new Player("Ryaskov", 150);
        Team team = new Team("Sochi", players);
        team.printPlayersTeam();
        Obstacle[] obstacles = new Obstacle[3];
        obstacles[0] = new Obstacle("lestnica", 25);
        obstacles[1] = new Obstacle("pocrushki", 30);
        obstacles[2] = new Obstacle("kanat", 40);
        Course course = new Course(obstacles, "polosa");
        course.doIt(team);
        team.showResults();





    }
}

