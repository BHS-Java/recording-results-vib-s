
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
        Scanner scanner = new Scanner(new File("src/playerList.csv"));
        Scanner scannerLine;
        ArrayList<Player> players = new ArrayList<Player>();

        int height;
        int age;
        String name;
        while(scanner.hasNextLine()){
            scannerLine = new Scanner(scanner.nextLine());
            name = scannerLine.next();
            height = Integer.parseInt(scannerLine.next());
            age = Integer.parseInt(scannerLine.next());
            players.add(new Player(name, height, age));
        }

        return players;
    }
    public void selectPlayer(Player p){
        addPerson(p);
    }
    public ArrayList<Player> getPlayers(){
        return this.playerList;
    }
}
