
import java.util.ArrayList;

public class Game {
    // Properties 
    private Result  results;
    private ArrayList<Player> playerList;
    private final String[] directions = new String[]{
        "up",
        "down",
        "left",
        "right"
    };

    // Constructor
    public Game(){
        makeEmptyResult();
    }
    public Game(Player p){
        makeEmptyResult();
        addPerson(p);
    }
    public Game(ArrayList<Player> p){
        makeEmptyResult();
        addPlayers(p);
    }

    // Methods
    public void   makeEmptyResult(){
        this.results = new Result();
    }
    public Result getResults(){
        return this.results;
    }
    public void   addPerson(Player p){
        this.playerList.add(p);
        this.results.addPlayer(p);
        p.setResults(this.results);
    }
    public void   addPlayers(ArrayList<Player> p){
        for(Player person : p){
            addPerson(person);
        }
    }
    public void   getDirectionOfStair(String direction_v, String direction_h, Player dPlayer){
        int up_value = 1;
        int right_value = 1;
        if(direction_v.equals(this.directions[1])) up_value *= -1;
        if(direction_h.equals(this.directions[2])) right_value *= -1;
        dPlayer.climb(up_value, right_value);
    }

}
