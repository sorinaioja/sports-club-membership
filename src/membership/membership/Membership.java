package membership.membership;

import membership.membership.AdultMembership;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Membership {

    public static void main(String[] args){
        System.out.println("Membership data!");

        Date currentDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);

        c.add(Calendar.YEAR, 1);
        Date newDate = c.getTime();

        AdultMembership a1 = new AdultMembership(1,"A1",currentDate, newDate,26 );
        a1.payFee();

        c.add(Calendar.MONTH, 2);
        Date newDate2 = c.getTime();

        ChildMembership c1 = new ChildMembership(2, "C1", currentDate, newDate2,16);
        SilverMembership s1 = new SilverMembership(3, "S1", currentDate, newDate, 33);
        GoldMembership g1 = new GoldMembership(4, "G1", currentDate, newDate2, 40);

        ArrayList<MembershipCard> memberships = new ArrayList<MembershipCard>(10);
        memberships.add(a1);
        memberships.add(c1);
        c1.payFee();
        memberships.add(s1);
        s1.payFee();
        memberships.add(g1);
        g1.payFee();


        c.add(Calendar.MONTH, 1);

        a1.updateMembership(c.getTime());
        a1.updateSubscription("SILVER");

        for(MembershipCard m: memberships){
            System.out.println(m.toString());
        }
    }
}
