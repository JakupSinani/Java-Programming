package hackerrank;

public class BiCycle {
    String define_me() {
        return "a vehivhle with pedals";
    }
}

class MotorCycle extends BiCycle {
    String define_me() {
        return "a cycle with an engine";
    }

    MotorCycle() {
        System.out.println("Hello I am a motorcycle, I am " + define_me());

        String temp = super.define_me();
        System.out.println("My ancestor is a cycle who is " + temp);
    }
}

class Solution {
    public static void main(String[] args) {
        MotorCycle m = new MotorCycle();
        System.out.println(m);
    }
}
