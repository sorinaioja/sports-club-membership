package member.member;

public class Member {
    private int id;
    private int age;
    private String name;
    private int postalCode;
    private double annualFee;

    public Member(int id, int age, String name, int postalCode) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.postalCode = postalCode;
        this.annualFee = 500.0;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
    public String toString(){
        return "Name: " + this.getName() + ", age: " + this.getAge() + ", anual fee " + this.annualFee;
    }
    public void payMemberFee(){
        System.out.println("Member " + this.getName() + " has paid the fee "+ annualFee);
    }

    public double getAnnualFee() {
        return annualFee;
    }

    public void setAnnualFee(double annualFee) {
        this.annualFee = annualFee;
    }
}
