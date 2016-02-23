
import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> teamPlayers;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.teamPlayers = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player playerName) {
        if ( this.teamPlayers.size() < this.maxSize ){
            this.teamPlayers.add(playerName);
        }
        
    }

    /*public String printPlayers() {

        String playersAsString = "";

        for (Player playerName : this.teamPlayers) {
            playersAsString += (playerName.toString()+ "\n");
        }

        return "" + playersAsString;
    }
    */
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int size(){
        return this.teamPlayers.size();
    }
    
    public int goals(){
        int totalGoals = 0;
        for ( Player player : this.teamPlayers ){
            totalGoals += player.goals();
        }
        
        return totalGoals;
    }
    
    public void printPlayers(){
        String playersAsString = "";

        for (Player playerName : this.teamPlayers) {
            playersAsString += (playerName.toString()+ "\n");
        }
        
        System.out.println(playersAsString);
    }
    
   

}
