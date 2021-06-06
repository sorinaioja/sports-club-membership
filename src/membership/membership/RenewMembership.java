package membership.membership;

import membership.membership.MembershipCard;

public interface RenewMembership {
    public MembershipCard getData(int id);
    public void updateSubscription(String newType);
}
