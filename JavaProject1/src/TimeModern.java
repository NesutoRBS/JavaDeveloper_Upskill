import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeModern {

    // ใช้ LocalTime ในการจัดการข้อมูลเวลา
    private LocalTime time;

    public TimeModern() {
        this.time = LocalTime.of(0, 0, 0);
    }

    public TimeModern(int hour, int minute, int second) {
        this.time = LocalTime.of(hour, minute, second);
    }

    public int getHour() {
        return time.getHour();
    }

    public int getMinute() {
        return time.getMinute();
    }

    public int getSecond() {
        return time.getSecond();
    }

    public TimeModern withTime(int hour, int minute, int second) {
        return new TimeModern(hour, minute, second);
    }

    /*
     * สร้าง object ใหม่ที่มีเวลาเพิ่มขึ้น 1 วินาทีจากเดิม
     * Return object TimeModern ใหม่ที่เวลาเพิ่มขึ้น
     */
    public TimeModern nextSecond() {
        // call plusSeconds(1)
        LocalTime newTime = this.time.plusSeconds(1);
        return new TimeModern(
                newTime.getHour(),
                newTime.getMinute(),
                newTime.getSecond());
    }
    @Override
    public String toString() {
        return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
