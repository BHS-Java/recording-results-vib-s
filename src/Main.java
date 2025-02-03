import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main implements Spec{
    // Properties
    private final Scanner scanner = new Scanner(System.in);

    public void main(String[] args) throws FileNotFoundException {

        Player p2 = new Player("SDf");
        p2.climb("down", "right");
        Game game = new Game();
        System.out.println(game.loadPlayers());
        System.out.println(game.getPlayers());
    }
    

    // Interface Methods
    public String   askString(String question){
        System.out.println(question);
        return this.scanner.nextLine();
    }

    public int      askNumber(String question) {
        System.out.println(question);
        int num = Integer.parseInt(scanner.nextLine());
        return num;
    }
    public Results  getResults(Game guessingOrBetter){
        return guessingOrBetter.getResults();
    }

    public Person makePerson(String name){
        Player p = new Player(name, askNumber("What is the player's age"), askNumber("What is the player's height"));
        return p;
    }
    public void     addResults(Person player){
        
    }


}