public class time {
    private int hour , minute , second;

    public time() {}


    public time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void SetTime(int hour, int minute, int second) {
        if(hour >= 0 &&hour < 25) this.hour = hour;
        if(minute >= 0 &&minute <= 60) this.minute = minute;
        if(second >= 0 &&second <= 60) this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public time nextSecond() {
        second++;
        if(second >= 60){
            second = 0;
            nextMinute();
        }
        return this;

    }

    public time nextMinute() {
        minute++;
        if(minute >= 60) {
            minute = 0;
            nextHour();
        }
        return this;
    }

    public time nextHour() {
        hour++;
        if(hour >= 24){
            hour = 0;
        }
        return this;
    }


    public time previosHours(){
        hour--;
        if(hour < 0){
            hour = 23;
        }
        return this;
    }

    public time previosMinutes(){
        minute--;
        if(minute < 0){
            minute = 59;
            previosHours();
        }
        return this;
    }

    public time previosSeconds(){
        second--;
        if(second < 0){
            second = 59;
            previosHours();
        }
        return this;
    }

    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
