package chapter03;

public class Quiz {
    int id = 0;

    public static void main(String[] args) {
        int x = 0;
        Quiz[] hq = new Quiz[5];
        while (x < 3) {
            hq[x] = new Quiz();
            hq[x].id = x;
            x = x + 1;
        }
        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];
    }
}
