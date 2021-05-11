package datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import static java.time.temporal.ChronoField.DAY_OF_MONTH;
import static java.time.temporal.ChronoField.MONTH_OF_YEAR;
import static java.time.temporal.ChronoField.YEAR;

public class App {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("askg", "sdkfhj", "skjdfg");
        for (String s :
                list) {
            list.add("hell");
        }
        list.forEach(System.out::println);

        System.out.println(new Date().toString());

//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//
//        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
//        format.withZone(ZoneId.systemDefault());
//        String formatDateTime = now.format(format);
//
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.FRENCH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT-3:00"));
        String simpleDate = simpleDateFormat.format(new Date());
//        System.out.println(simpleDate + " ==== corrr");
//
//        System.out.println(formatDateTime + " === correct");
//
//        LocalDateTime then = LocalDateTime.parse(formatDateTime, format);
//        System.out.println(then);

        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar.getTime());

        simpleDateFormat.setCalendar(calendar);
        calendar.setTimeZone(TimeZone.getTimeZone("GMT-10:00"));
        final String format = simpleDateFormat.format(calendar.getTime());
        System.out.println(format);

        System.out.println(calendar.getTime());

    }

    private static String formatStringFromDate(LocalDateTime dateTime) {
        return dateTime.format(new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendValue(DAY_OF_MONTH, 2)
                .appendLiteral(".")
                .appendValue(MONTH_OF_YEAR, 2)
                .appendLiteral(".")
                .appendValue(YEAR, 4).optionalStart()
                .parseLenient()
                .parseStrict()
                .toFormatter());
    }

    private static LocalDateTime formatDateFromString(String sDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDateTime.parse(sDate, formatter);
    }
}
