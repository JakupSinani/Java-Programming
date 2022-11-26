package array.dsa;

public class ScoreBoard {
    private int numEntrie = 0;    //  number of actual entries
    private final GameEntry[] board;   //  array of game entrie(name&score)

    //  constructs an empty scoreboard with the given capacity for storing entries
    public ScoreBoard(int capacity) {
        board = new GameEntry[capacity];
    }

    //  atempt to add a new score to the collection (if it is high enough)
    public void add(GameEntry e) {
        int newScore = e.getScore();
        //  is the new entry a really a high score?
        if (numEntrie < board.length || newScore > board[numEntrie - 1].getScore()) {
            numEntrie++;
            //  shift any lower scores rightward to make room for the new entry
            int j = numEntrie - 1;
            while (j > 0 && board[j - 1].getScore() < newScore) {
                board[j] = board[j - 1];    //  shift entry from j-1 to j
                j--;    //  and decrement j
            }
            board[j] = e;
        }
    }

    //  remove and return the high score at index
    public GameEntry remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= numEntrie) {
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        }
        GameEntry temp = board[i];    //  save the object to be removed
        for (int j = i; j < numEntrie - 1; j++) {    //  count up from i (not down)
            board[j] = board[j + 1];    //  move one cell to the left
        }
        board[numEntrie - 1] = null;    //  null out the old last score
        numEntrie--;
        return temp;    //  return the removed objects
    }
}
