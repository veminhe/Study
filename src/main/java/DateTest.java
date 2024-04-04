import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date firstSignDateDt = new Date();
        if(firstSignDateDt!=null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String firstSignDate = sdf.format(firstSignDateDt);
            firstSignDate = firstSignDate.substring(0, firstSignDate.indexOf(" "));
            System.out.print(firstSignDate);
        }
    }
}
