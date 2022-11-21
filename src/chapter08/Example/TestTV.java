package chapter08.Example;

public class TestTV {
    //  main method
    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();
        tv.setChannel(30);
        tv.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        System.out.println("tv's chanel is " + tv.channel + " and volume level is " + tv.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }
}
