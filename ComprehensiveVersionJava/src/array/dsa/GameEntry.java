package array.dsa;

public class GameEntry {
    private String name;    //  name of the person earning this score
    private int score;  //   the score value

    //  constructs a game entry with given parameters

    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }
    //  returns the name field
    public String getName() {
        return name;
    }
    //  returns the score field
    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "("+name+", "+score+")";
    }
}
