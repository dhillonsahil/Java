package Api;
import java.time.*;
import java.util.Date;

public class DisplayTime {
    public static void main(String[] args) {
        // Method 1
        LocalDate dt1 =  LocalDate.now();
        System.out.println(dt1);
        
        // Type 2
        Date dt = new Date();
        System.out.println(dt.getTime());
        System.out.println(dt);

        // Type 3
        java.sql.Date dt2 = new java.sql.Date(dt.getTime());
        System.out.println(dt2);

    }
}
