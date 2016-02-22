import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("NHL Statistics:");
        //Top ten players based on goals
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        //Top 25 players based on penalty amounts
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        //Statistics for Sidney Crosby
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        //Statistics for Philadelphia Flyers
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        
        //Players in Anaheim Ducks
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
        
    }
}
