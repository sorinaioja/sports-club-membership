package member.member;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello Members");
        MembersData data = new MembersData(30);
        data.addNewMember("Maria", 45620, 15);
        data.addNewMember("John", 89933, 25);

        Subscriber subscriber = new Subscriber(3,25, "Karama", 790380);
        data.addMember(subscriber);
        subscriber.subscribe();

        Member member = new Member(4, 22,"Ioana", 456456);
        data.addMember(member);
        member.setAnnualFee(400.0);
        member.payMemberFee();

        MemberVoteRights sorina = new MemberVoteRights(5,21,"Sorina", 402301);
        Date currentDate = new Date();
        sorina.setElectedDate(currentDate);
        sorina.vote();
        data.addMember(sorina);

        for(Member m: data.members){
            System.out.println(m.toString());
        }

    }
}
