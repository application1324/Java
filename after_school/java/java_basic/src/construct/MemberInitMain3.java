package construct;

public class MemberInitMain3 {
    public static void main(String[] args) {
        MemberInto member1 = new MemberInto();
        // 메서드 이용 초기화1
        member1.initMember("user1", 15, 90);

        MemberInto member2 = new MemberInto();
        // 메서드 이용 초기화10
        member2.initMember("user2", 16, 80);

        MemberInto[] members = {member1, member2};

        for (MemberInto member : members) {
            System.out.printf("이름 : %s 나이 : %d 성적 : %d", member.name, member.age, member.grade);
            System.out.println();
        }
    }
}
