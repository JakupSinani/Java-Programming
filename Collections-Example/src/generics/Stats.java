package generics;

public class Stats<T extends Number> {
    T[] nums;    //  array of number or subclass

    //  pass the constructor a reference to
    //  an array of type number or subclass

    public Stats(T[] nums) {
        this.nums = nums;
    }

    //  return type double in all cases.
    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    boolean sameAvg(Stats<?> ob) {
        if (average() == ob.average()) {
            return true;
        }
        return false;
    }
}

//  demonstrate stats.
class BoundsDemo {
    public static void main(String[] args) {

        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<Integer>(inums);
        double v = iOb.average();
        System.out.println("iOb average is " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<>(dnums);
        double w = dob.average();
        System.out.println("dob average is " + w);

        if (iOb.sameAvg(dob)) {
            System.out.println("Averages are the same.");
        } else {
            System.out.println("Averages differ.");
        }

        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<>(fnums);
        double x = fob.average();
        System.out.println("Fob average is " + x);

        System.out.println("Average of iob and fob");
        if (iOb.sameAvg(fob)) {
            System.out.println("are the same");
        } else {
            System.out.println("differ");
        }
    }
}
