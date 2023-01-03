public class MultiThreading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MultiThreadThing mything = new MultiThreadThing(i);
            mything.start();
        }
        /*MultiThreadThing mything = new MultiThreadThing();
        MultiThreadThing mything2 = new MultiThreadThing();

    *//*mything.start();
    mything2.start();*//*
        mything.run();
        mything2.run();*/

    }
}
