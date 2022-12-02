package example.example4;

public class Moof {
    private int moofValue;

    public Moof(int moofValue) {
        this.moofValue = moofValue;
    }

    public int getMoofValue() {
        return moofValue;
    }

    public boolean equals(Object o) {
        if ((o instanceof Moof) && (((Moof) o).getMoofValue() == this.moofValue)) {
            return true;
        } else {
            return false;
        }
    }
}
