public class Player implements Person {
    // Properties
    private String  name;
    private int     height;
    private int     age;
    private Result  results = new Result();

    // Constructor
    public Player(int height, int age) {
        this.height = height;
        this.age = age;
    }

    // Methods

    // Interface Methods
    public void     setName(String name){
        this.name = name;
    }
    public String   getName(){
        return this.name;
    }
    public int      getHeight(){
        return this.height;
    }
    public int      getAge(){
        return this.age;
    }
    public Results  getResults(){
        return this.results;
    }
    public void setResults(Result newResults){
        this.results = newResults;
    }
}
