// NOTES TO BE MADE OF THIS QUESTION 
public class question_1344_POTD {
    public static void main(String[] args) {
        
        int hour = 12;
        int minutes = 30;
        System.out.println(angleClock(hour, minutes));

    }
    static double angleClock(int hour, int minutes){
        int minutesAngle = minutes * 6;
        double hourAngle = (hour * 30) + (minutes * 0.5);
        double diff = Math.abs(hourAngle - minutesAngle);
        double min = Math.min(diff, 360 - diff);
        return min;
    }
}
