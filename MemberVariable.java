package Assignment2;

public class MemberVariable {
    public static void main(String[] arg){
        Member member = new Member();
        member.setName("Parul");
        member.setAge(24);
        member.setSalary(60000);
        System.out.println("Members Name: " + member.getName());
        System.out.println("Members Age: " + member.getAge());
        System.out.println("Members Salary: " + member.getSalary());
    }
}
