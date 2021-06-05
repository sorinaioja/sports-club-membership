import java.util.Date;

public class ChildMembership extends MembershipCard implements MembershipCardType{

    public ChildMembership(int id, String name, Date startDate, Date endDate, int age) {

        super(id, name, startDate, endDate, age);
        this.setPrice(getFee());
    }

    @Override
    public double getFee() {
        return 0.9*STANDARD_FEE;
    }
}
