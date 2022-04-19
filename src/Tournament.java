import java.time.LocalDate;
import java.util.*;

public class Tournament {
    private String name;
    private LocalDate start_date;
    private List<Player> players = new ArrayList<>();

    public Tournament(String name, LocalDate start_date) {
        this.name = name;
        this.start_date = start_date;
    }

    public Tournament(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public List<Player> getPlayers() {
        return players;
    }

    void addPlayer(Player player) {
        players.add(player);
    }

    public void createPairs() {
        Player[] teams = new Player[players.size()];
        for (int i = 0; i < players.size(); i++) {
            teams[i] = players.get(i);
        }
        Player[] team1 = new Player[teams.length / 2];
        Player[] team2 = new Player[teams.length / 2];
        LocalDate date;
        if (getStart_date() == null) {
            date = LocalDate.now();
        } else {
            date = getStart_date();
        }
        date = date.plusDays(1);
        int schedule;
        int day = 0;
        if (teams.length % 2 == 0) {
            schedule = teams.length - 1;
        } else {
            schedule = teams.length;
        }
        while (day < schedule) {
            System.out.println(getName() + ", " + date);
            day++;
            date = date.plusDays(1);
            int temp = 1;
            for (int i = 0; i < temp; i++) {
                Player tmp;
                if (teams.length % 2 == 0) {
                    tmp = teams[1];
                } else {
                    tmp = teams[0];
                }
                if (teams.length % 2 == 0) {
                    for (int j = 1; j < teams.length - 1; j++)
                        teams[j] = teams[j + 1];
                    teams[teams.length - 1] = tmp;
                } else {
                    for (int j = 0; j < teams.length - 1; j++)
                        teams[j] = teams[j + 1];
                    teams[teams.length - 1] = tmp;
                }
            }
            for (int i = 0; i < teams.length / 2; i++) {
                team1[i] = teams[i];
                team2[i] = teams[teams.length - i - 1];
                System.out.print(team1[i] + " - " + team2[i] + "\n");
            }
        }
    }
}