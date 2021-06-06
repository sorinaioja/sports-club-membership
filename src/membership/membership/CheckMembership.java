package membership.membership;

import java.util.Date;

public interface CheckMembership {
    public MembershipCard getData(int id);
    public void updateMembership(Date newDate);

}
