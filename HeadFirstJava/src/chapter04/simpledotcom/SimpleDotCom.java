package chapter04.simpledotcom;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits;

    void setLocationCells(int[] loc) {
        locationCells = loc;
    }

    String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);    //  convert the string to an int
        String result = "miss";

        //  repeat with each cell in the int array
        for (int cell : locationCells) {
            if (guess == cell) {   //  compare the user guess to this element in the array
                result = "hit";
                numOfHits++;    //  we got a hit

                break;  //  get out of the loop, no need to test the other cells
            }
        }
        if (numOfHits == locationCells.length) {    //  find out if it was the last cell if number of hits is 3
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
