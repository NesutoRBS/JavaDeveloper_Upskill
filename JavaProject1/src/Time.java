public class Time {
    private int second;
    private int minute;
    private int hour;

    // Constructor
    public Time(int second, int minute, int hour) {
        // this.second = second;
        // this.minute = minute;
        // this.hour = hour;
        setTime(second, minute, hour);
    }

    // Getter
    public int getSecond() {
        return this.second;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getHour() {
        return this.hour;
    }
    // End of Getter

    // Setter methods with validation
    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("Second must be between 0 and 59");
        }
        this.second = second;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        }
        this.minute = minute;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
        this.hour = hour;
    }

    public void setTime(int second, int minute, int hour) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    // End of Setter

    // toString
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    /*
     * Advance the time byy 1 second.
     * Returns the current object to allow for method chaining.
     * Return the current Time Object
     */

    public Time nextSecond() {
        this.second++;
        if (this.second == 60) {
            this.second = 0;
            this.minute++;
            if (this.minute == 60) {
                this.minute = 0;
                this.hour++;
                if (this.hour == 24) {
                    this.hour = 0;
                }
            }
        }

        return this;
    }

}