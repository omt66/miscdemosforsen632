/*
 *  NU Educational License - 2017
 */
package chapter8.timedemo;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Time {
    private int hour; // 0 - 23
    private int min;  // 0 - 59
    private int sec;  // 0 - 59
    
    Time() {
        this.hour = 0;
        this.min = 0;
        this.sec = 0;
    }
    
    Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
    
    void setTime(int hour, int min, int sec) {
        if (hour < 0 || hour > 23 || min < 0 || min > 59 || sec < 0 || sec > 59)
            throw new IllegalArgumentException("Problem with the parameters, the time cannot be set!");
        
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
    
    public void printStandard() {
        //System.out.println("" + hour + ":" + min + ":" + sec);
        System.out.println(toUniversalString());
    }
    
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, min, sec);
    }
    
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(12, 45, 30);
        Time t3 = new Time(11, 8, 7);
        
        t1.printStandard();
        t2.printStandard();
        t3.printStandard();
        
        t3.setTime(-10, 1000, -9999);
        t3.printStandard();
    }
}
