package member.member;

import java.util.Date;

public class MemberVoteRights extends Member{
    private Date electedDate;


    public MemberVoteRights(int id, int age, String name, int postalCode) {
        super(id, age, name, postalCode);
    }

    public void vote(){
        System.out.println("The member " + this.getName()+ " elected on "+ electedDate + "  has vote.");
    }

    public void elections(Date electionDate){
        System.out.println("The member " + this.getName() + " has been elected on " + electionDate);
        setElectedDate(electionDate);
    }
    public Date getElectedDate() {
        return electedDate;
    }

    public void setElectedDate(Date electedDate) {
        this.electedDate = electedDate;
    }
    @Override
    public String toString(){
        return "Name: " + this.getName() + ", age: " + this.getAge() + ", elected date: " + this.electedDate;
    }
}
