
import java.util.ArrayList;

public class Result implements Results {
    // Properties
    private ArrayList<Person> playersPlayed;

    // Constructor
    public Result() {}
    public Result(ArrayList<Person> p){
        playersPlayed.addAll(p);
    }
    // Methods
    public void     addPlayer(Person p){
        playersPlayed.add(p);
    }
    public void     addPlayers(ArrayList<Person> p){
        playersPlayed.addAll(p);
    }
}
