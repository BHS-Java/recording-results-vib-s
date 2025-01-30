import java.util.Scanner;

public class Main implements Spec{
    // Properties
    private Scanner scanner = new Scanner(System.in);

    public void main(String[] args) {
        String name = askString("What is the player's name");
        Person p = makePerson(name);
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
    public Person   makePerson(String name, int age, int height){
        Player p = new Player(name, age, height);
        return p;
    }
    public Person makePerson(String name){
        Player p = new Player(name, askNumber("What is the player's age"), askNumber("What is the player's height"));
        return p;
    }
    public void     addResults(Person player){
        
    }


}