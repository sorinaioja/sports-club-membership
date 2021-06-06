package member.member;

import java.util.ArrayList;

public class MembersData implements MemberMgt {

    ArrayList<Member> members = new ArrayList<Member>();
    private static int n = 0;

    public MembersData(int capacity){
        this.members = new ArrayList<Member>(capacity);
    }
    public void addMember(Member member){
        members.add(member);
        n++;
    }
    @Override
    public boolean checkValidity(String name, int age) {
        if(age < 16 ) {
            System.out.println("Mr/Mrs " + name + " is too young to be a member.");
            return false;
        }
        return true;
    }

    @Override
    public void addNewMember(String name, int postalCode, int age) {
        if(checkValidity(name,age)){
            Member newMember = new Member(n,age, name, postalCode);
            n++;
            members.add(newMember);
            System.out.println(newMember.getName() + " has been added. ");
        }

    }
    @Override
    public void validateCredentials(String loginRef) {
        System.out.println("The credentials are valid.");
    }

}
