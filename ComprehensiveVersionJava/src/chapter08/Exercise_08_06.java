package chapter08;

public class Exercise_08_06 {
    private long startTime;
    private long endTime;

    public Exercise_08_06() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public  void start(){
        startTime=System.currentTimeMillis();
    }
    public void stop(){
        endTime=System.currentTimeMillis();
    }
    public long getElapsedTime(){
        long get=getEndTime()-getStartTime();
        return get/1000;
    }
}
