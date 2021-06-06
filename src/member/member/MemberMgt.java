package member.member;

public interface MemberMgt {
    public boolean checkValidity(String name, int age);
    public void addNewMember(String name, int postalCode, int age);
    public void validateCredentials(String loginRef);
}
