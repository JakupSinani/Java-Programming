package chapter07.example;

public class Example4 {
    public static void main(String[] args) {
        int[][] twoD = new int[4][5];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 4; j++) {
                twoD[i][j] = k;
                k++;
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

    }
}
