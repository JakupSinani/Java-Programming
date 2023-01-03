public class MultiThreadThing extends Thread {
    private int threadNumber;

    public MultiThreadThing(int threadNUmber) {
        this.threadNumber = threadNUmber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thead " + threadNumber);
            if (threadNumber == 3) {
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
