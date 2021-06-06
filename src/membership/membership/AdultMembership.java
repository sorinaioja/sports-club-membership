package membership.membership;

import java.util.Date;

public class AdultMembership extends MembershipCard implements MembershipCardType {
    public AdultMembership(int id, String name, Date startDate, Date endDate, int age) {
        super(id, name, startDate, endDate, age);
        this.setPrice(getFee());
    }

    @Override
    public double getFee() {
        return MembershipCardType.STANDARD_FEE;
    }
}
