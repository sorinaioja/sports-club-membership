import java.util.Calendar;
import java.util.Date;

public class Membership {

    public static void main(String[] args){
        System.out.println("Hello, Membership!");
        Date currentDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        c.add(Calendar.YEAR, 1);
        Date newDate = c.getTime();

        AdultMembership a1 = new AdultMembership(1,"A1",currentDate, newDate,26 );
        a1.payFee();

        System.out.println(a1.toString());
        c.add(Calendar.MONTH, 1);
        a1.updateMembership(c.getTime());
        a1.updateSubscription("SILVER");
        System.out.println(a1.toString());
    }
}
