package oop_part2;

public class Monitor {
    private String model;
    private String manufaturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufaturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufaturer = manufaturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in colour" + color);
    }
}
