package membership.membership;

import java.util.Date;

public class MembershipCard implements GetMembership, RenewMembership, CheckMembership {
    private int id;
    private String name;
    private double price;
    private Date startDate;
    private Date endDate;
    private int age;

    public MembershipCard(int id, String name, Date startDate, Date endDate, int age) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.age = age;
    }

    @Override
    public void updateMembership(Date newDate) {
        if(newDate.after(this.startDate))
            this.endDate = newDate;
    }

    @Override
    public void setSportClub() {

    }

    @Override
    public void payFee() {
        System.out.println("The member has paid " + price);
    }

    @Override
    public void insertCustomerData(String name, int age) {
        this.setAge(age);
        this.setName(name);

    }

    @Override
    public MembershipCard getData(int id) {
        if(id == this.id)
            return this;
        return null;
    }

    @Override
    public void updateSubscription(String newType) {
        System.out.println("Membership with id " + id + this.toString() + " was changed with ");
    }

    @Override
    public String toString(){
        return "Id membership: " + getId() + "\nstart date: " + getStartDate() + "\nend date: " + getEndDate() + "\nprice " + getPrice() + " / year";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
