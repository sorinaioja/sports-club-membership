import java.util.Date;

public class GoldMembership extends MembershipCard implements MembershipCardType{
    public GoldMembership(int id, String name, Date startDate, Date endDate, int age) {
        super(id, name, startDate, endDate, age);
        this.setPrice(getFee());
    }

    @Override
    public double getFee() {
        return 0.75*STANDARD_FEE;
    }
}
