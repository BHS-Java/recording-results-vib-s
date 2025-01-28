import java.util.Scanner;

public class Main implements Spec{
    // Properties
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
    }
    

    // Interface Methods
    public String   askString(String question){
        return "hi";
    }

    public int      askNumber(String question) {
        System.out.println(question);
        int num = Integer.parseInt(scanner.nextLine());
        return num;
    }
    public Results  getResults(Game guessingOrBetter){
        return guessingOrBetter.getResults();
    }
    public Person   makePerson(String name){
        Player p = new Player(128, 11);
        return p;
    }
    public void     addResults(Person player){
        
    }


}