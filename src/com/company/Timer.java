package com.company;

public class Timer {
    long start;
    long stop;

    public void start(){
        this.setStart(System.nanoTime());
    }
    public void stop(){
        this.setStop(System.nanoTime());
    }
    public double elapsedTime(){
        double difference = (this.getStop() - this.getStart())/1e6;
        return difference;
    }

    public long getStart() {
        return this.start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getStop() {
        return this.stop;
    }

    public void setStop(long stop) {
        this.stop = stop;
    }
}
