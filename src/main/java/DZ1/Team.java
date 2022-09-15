package DZ1;

public class Team {
    private String teamName;
    Player[] players;

    public Team(String teamName, Player[] players) {
        this.teamName = teamName;
        this.players = players;
    }

    public void printPlayersTeam() {
        System.out.println(teamName + ":");
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i].name);
        }

    }

    public void showResults() {
        System.out.println("Winners: ");
        for (int i = 0; i < players.length; i++) {
            if (players[i].stamina >= 0) {
                System.out.println(players[i].name);

            }
        }
    }

}
