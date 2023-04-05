package Api;
import java.util.*;
import java.time.*;

public class DateTime2 {
    public static void main(String[] args){
        LocalDate d1 = LocalDate.now();
        
        System.out.println(d1.getMonthValue()+"/"+d1.getDayOfMonth()+"/"+d1.getYear());
    } 
}
