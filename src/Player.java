public class Player implements Person {
    // Properties
    private String  name;
    private int     height;
    private int     age;
    private Result  results = new Result();

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
    public void setResults(Result newResults){
        this.results = newResults;
    }
}
