package member.member;

import java.util.Random;

public class Subscriber extends Member{
    private String ticketReference;
    private String seatReference;

    public Subscriber(int id, int age, String name, int postalCode) {
        super(id, age, name, postalCode);
        this.ticketReference = generateRandomReference(10);
        this.seatReference = generateRandomReference(10);
    }

    public void subscribe(){
        System.out.println("The member with the ticket reference " + ticketReference + " has successfully subscribed for the event. Seat reference " + seatReference + ".");
    }
    public void unsubscribe(){
        System.out.println("Successfully unsubscribed!");
    }
    public static String generateRandomReference(int len) {
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
                +"lmnopqrstuvwxyz!@#$%&";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        return sb.toString();
    }
    @Override
    public String toString(){
        return "Name: " + this.getName() + ", age: " + this.getAge() + ", subscribe reference " + this.ticketReference;
    }
}
