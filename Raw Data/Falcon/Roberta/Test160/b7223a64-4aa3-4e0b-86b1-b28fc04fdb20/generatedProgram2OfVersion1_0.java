import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// ...

class TimelineComparator implements Comparator<String> {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); // Adjust pattern as needed

    @Override
    public int compare(String s1, String s2) {
        LocalDateTime dt1 = LocalDateTime.parse(s1, formatter);
        LocalDateTime dt2 = LocalDateTime.parse(s2, formatter);
        return dt1.compareTo(dt2); 
    }
}
