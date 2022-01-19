class Frog{
    private int id;
    private String name;

    public Frog (int id, String name){
        this.id= id;
        this.name = name;
    }
    Public String toString(){
        return String.format("%-4d: %s", id ,name
        )
    }

}
public class App{
    public static void main(String[] args){
        Frog frog1 = new Frog(7, "freddy")
    }
}