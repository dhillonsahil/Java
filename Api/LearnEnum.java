package Api;

public class LearnEnum {
    public static void main(String[] args) {
        Days dy = Days.MONDAY;
        System.out.println(dy);
    }
}

enum Days{
    MONDAY,TUEDAY,WEDNESDAY,THRUSDARY , FRIDAY ,SATURDAY;
    int day;
    public void getDay(){
        System.out.println(day);
    }
    
}