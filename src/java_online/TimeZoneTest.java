package java_online;

import java.util.Arrays;
import java.util.TimeZone;

public class TimeZoneTest {
    public static void main(String[] args) {

        TimeZone timeZone = TimeZone.getDefault() ;
        int rawOffSet = timeZone.getRawOffset() ;

        System.out.println("Текущая TimeZone : "
                            + timeZone.getID()
                            + "\t("
                            + timeZone.getDisplayName()
                            + "}\n");

        System.out.println("А теперь доступные Timezone'ы\n");
        String[] aviableTimezones = TimeZone.getAvailableIDs() ;

        for (String aviableTimezone : aviableTimezones) {
            TimeZone currentTZ = TimeZone.getTimeZone(aviableTimezone);
            System.out.println(getFormatted(currentTZ));
        }

        System.out.println("А теперь список Timezone, соответствующей текущей\n");

        String[] fittingTimezones = TimeZone.getAvailableIDs(rawOffSet) ;

        for (String fittingTimezone : fittingTimezones) {
            TimeZone current = TimeZone.getTimeZone(fittingTimezone);
            System.out.println(getFormatted(current));
        }
    }

    private static String getFormatted(TimeZone currentTZ) {
        String line = String.format("%s (%s)", currentTZ.getID(), currentTZ.getDisplayName());
        line = align(line) ;
        line += String.format("hour offset =(%d)", currentTZ.getRawOffset()/3_600_000) ;
        return line;
    }

    private static String align(String line) {
        int difference = 64 - line.length() ;
        if (difference > 0) {
            char[] buf = new char[difference] ;
            Arrays.fill(buf, ' ');
            return line + new String(buf) ;
        }
        else return line.substring(0, 64) ;
    }
}
