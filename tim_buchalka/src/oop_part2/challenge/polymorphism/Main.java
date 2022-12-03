package oop_part2.challenge.polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());


        System.out.println();


        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());


        System.out.println();


        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }

    static class Holden extends Car {
        public Holden(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Holden --> startEngine()";
        }

        @Override
        public String accelerate() {
            return "Holden --> accelerate()";
        }

        @Override
        public String brake() {
            return "Holden --> brake()";
        }
    }

}
