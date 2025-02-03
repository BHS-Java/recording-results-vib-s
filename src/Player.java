public class Player implements Person {
    // Properties
    private String  name;
    private int     height;
    private int     age;
    private Result  results = new Result();
    private final String[] directions = new String[]{
        "up",
        "down",
        "left",
        "right"
    };

    // Constructor
    public Player(String name, int age, int height) {
        setName(name);
        setAge(age);
        setHeight(height);
    }
    public Player(String name){
        setName(name);
    }

    // Methods

    // Interface Methods
    public void     setName(String name){
        this.name = name;
    }
    public String   getName(){
        return this.name;
    }
    public void     setHeight(int height){
        this.height = height;
    }
    public int      getHeight(){
        return this.height;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int      getAge(){
        return this.age;
    }
    public Results  getResults(){
        return this.results;
    }
    public void     setResults(Result newResults){
        this.results = newResults;
    }
    public void     climb(String direction_vertical, String direction_horizontal){
        if(direction_vertical.equals(this.directions[0])){
            for (int i = 0; i < 4; i++) {
                if(direction_horizontal.equals(this.directions[3])){
                    for (int x = i; x < 4; x++){
                        System.out.print(" ");
                    }
                }
                for (int x = 0; x < i; x++) {
                System.out.print("*");
                }
            System.out.println();
            }
        } else if(direction_vertical.equals(this.directions[1])){
            for (int i = 4; i > 0; i--) {
                if(direction_horizontal.equals(this.directions[2])){
                    for (int x = i; x < 4; x++){
                        System.out.print(" ");
                    }
                }
                for(int x = 1; x < i; x++){
                    System.out.print("*");
                } 
                System.out.println();
                }
        } else{ System.out.println("Invalid Input ");}
        System.out.println();
        }
    }

