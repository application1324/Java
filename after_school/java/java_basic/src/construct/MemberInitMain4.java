package construct;

public class MemberInitMain4 {
    public static void main(String[] args) {
        // 생성자을 이용한 초기화
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);

        MemberConstruct member2 = new MemberConstruct("user2", 60);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.printf("이름 : %s 나이 : %d 성적 : %d", member.name, member.age, member.grade);
            System.out.println();
        }
    }
}
