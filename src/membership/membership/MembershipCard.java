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
        else
            System.out.println("The inserted date is before the started date");
    }

    @Override
    public void setSportClub() {
        System.out.println("Sport Club has been set.");
    }

    @Override
    public void payFee() {
        System.out.println("The member " + this.name + " has paid " + price);
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
        System.out.println("Membership with id " + id + " is pending changes with " + newType + " membership");
    }

    @Override
    public String toString(){
        return "Id membership: " + getId() + "\nstart date: " + getStartDate() + "\nend date: " + getEndDate() + "\nprice " + getPrice() + " / year. \n";
    }

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }



    public double getPrice() {
        return price;
    }


    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
