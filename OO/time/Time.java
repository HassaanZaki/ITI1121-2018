public class Time {


    private int hours;
    private int minutes;
    private int seconds;

    public Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
        normalize();
    }

    public int getHours(){
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void increase() {
        seconds++;
        normalize();
    }

    public boolean equals(Time other){
        return ((hours == other.getHours()) &&
                (minutes == other.getMinutes()) &&
                (seconds == other.getSeconds()));
        // OR
        //return ((hours == other.hours) &&
        //        (minutes == other.minutes) &&
        //        (seconds == other.seconds));
        //
    }

    private void normalize() {
        int carry = seconds / 60;
        seconds = seconds % 60;
        minutes = minutes + carry;

        carry = minutes / 60;
        minutes = minutes % 60;

        hours += carry;

        hours = hours % 24;
    }

    public String toString() {
        return "This Time object has " + hours +" hours, "
         + minutes + " minutes and " + seconds + " seconds.";
    }
}



































/*
public class Time {

    static public final int HOURS_PER_DAY = 24;
    static public final int MINUTES_PER_HOUR = 60;
    static public final int SECONDS_PER_MINUTE = 60;

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int h, int minutes, int seconds){
        hours = h;
        this.minutes = minutes;
        this.seconds = seconds;
        normalize();
    }

    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }

    public boolean equals(Time other){
        return ((hours == other.hours) &&
                (minutes == other.getMinutes()) &&
                (seconds == other.getSeconds()));
    }

    public void increase(){
        seconds ++;
        normalize();
    }

    private void normalize(){
        int carry = seconds / SECONDS_PER_MINUTE;
        seconds = seconds % SECONDS_PER_MINUTE;
        minutes += carry;
        carry = minutes / MINUTES_PER_HOUR;
        minutes = minutes % MINUTES_PER_HOUR;
        hours = (hours + carry) % HOURS_PER_DAY;
    }

    public String toString(){
        return "Hours: " + hours  + " minutes: " 
        + minutes + " seconds: " + seconds;
    }
}
*/


