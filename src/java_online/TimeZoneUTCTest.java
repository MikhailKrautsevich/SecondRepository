package java_online;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date ;
import java.util.TimeZone;

public class TimeZoneUTCTest {

    public static void main(String[] args) {

        final String TIMEZONE_utc = "UTC" ;
        final String TIMEZONE_msc = "Europe/Moscow" ;
        final String DATETIME_format = "yyyy-MM-dd HH:mm:ss.SS" ;

        Date date = new Date() ;
        Date dt_msc = null ;

        TimeZone tm_curr = TimeZone.getDefault() ;
        System.out.println("Current Timezone : \""
                + tm_curr.getID()
                + "\"("
                + tm_curr.getDisplayName()
                + ")");
        System.out.println("useDaylightTime : "
                + tm_curr.useDaylightTime()
                + "\n");

        TimeZone tm_utc = TimeZone.getTimeZone(TIMEZONE_utc) ;
        TimeZone tm_msc = TimeZone.getTimeZone(TIMEZONE_msc) ;

        DateFormat df_utc = new SimpleDateFormat(DATETIME_format) ;
        DateFormat df_msc = new SimpleDateFormat(DATETIME_format) ;

        df_utc.setTimeZone(tm_utc);
        df_msc.setTimeZone(tm_msc);

        String date_utc = df_utc.format(date) ;
        String date_msc = df_msc.format(date) ;

        try {
            dt_msc = df_msc.parse(date_msc) ;
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("UTC\n" + date);
        System.out.println(date_utc);
        System.out.println(tm_utc.getRawOffset());
        System.out.println();
        System.out.println("Moscow\n" + dt_msc);
        System.out.println(date_msc);
    }
}
