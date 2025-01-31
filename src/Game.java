
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Game {
    // Properties 
    private Result  results;
    private ArrayList<Player> playerList;


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
    public ArrayList<Player>   loadPlayers() throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("/src/playerList.csv"));
        Scanner scannerLine = new Scanner(scanner.nextLine());
        ArrayList<Player> players = new ArrayList<Player>();

        while(scanner.hasNextLine()){
            String name = scannerLine.next();
            int height = scannerLine.next();
            int age = scannerLine.next();
            players.add
        }

    }

}
