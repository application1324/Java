package construct;

public class MemberInitMain1 {
    public static void main(String[] args) {

//        인스턴스화, 값의 초기화
        MemberInto member1 = new MemberInto();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

//        인스턴스화, 값의 초기화
        MemberInto member2 = new MemberInto();
        member2.name = "user2";
        member2.age = 16;
        member2.grade = 80;

        MemberInto[] members = {member1, member2};

        for(MemberInto member : members) {
            System.out.printf("이름 : %s 나이 : %d 성적 : %d", member.name, member.age, member.grade);
            System.out.println();
        }
    }
}
