package membership.membership;

import membership.membership.MembershipCard;
import membership.membership.MembershipCardType;

import java.util.Date;

public class SilverMembership extends MembershipCard implements MembershipCardType {

    public SilverMembership(int id, String name, Date startDate, Date endDate, int age) {
        super(id, name,startDate, endDate, age);
        this.setPrice(getFee());
    }

    @Override
    public double getFee() {
        return 0.85*STANDARD_FEE;
    }
}
