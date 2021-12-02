package defaultconstructor.chess;

import java.util.ArrayList;
import java.util.List;

public class ChessTournament {
    List<Team> teams = new ArrayList<>();

    public ChessTournament() {
        Team t1 = new Team();
        Team t2 = new Team();
        Team t3 = new Team();
        teams.add(t1);
        teams.add(t2);
        teams.add(t3);
    }

    public void addPlayersToTeams(List<Player> playersRegistrated) {

        int i = 0;
        while (i <= 5 && i < playersRegistrated.size()) {
            teams.get(i / 2).setPlayerOne(playersRegistrated.get(i));
            if (playersRegistrated.size() > i + 1) {
                teams.get(i / 2).setPlayerTwo(playersRegistrated.get(i + 1));
            }
            i += 2;
        }
    }

    public List<Team> getTeams() {
        return teams;
    }
}





