import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        Tournament tournamentA = new Tournament("Tournament А", LocalDate.of(2022, Month.DECEMBER, 30));
        tournamentA.addPlayer(new Player("Player 1", "Minsk"));
        tournamentA.addPlayer(new Player("Player 2", "Mogilev"));
        tournamentA.addPlayer(new Player("Player 3", "Vitebsk"));
        tournamentA.addPlayer(new Player("Player 4", "Gomel"));
        tournamentA.createPairs();

        Tournament tournamentB = new Tournament("Tournament B");
        tournamentB.addPlayer(new Player("Player 1"));
        tournamentB.addPlayer(new Player("Player 2"));
        tournamentB.addPlayer(new Player("Player 3"));
        tournamentB.addPlayer(new Player("Player 4"));
        tournamentB.addPlayer(new Player("Player 5"));
        tournamentB.addPlayer(new Player("Player 6"));
        tournamentB.addPlayer(new Player("Player 7"));
        tournamentB.createPairs();
    }
}




