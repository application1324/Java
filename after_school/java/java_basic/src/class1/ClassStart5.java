package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        // 리펙토링
        // 1. 선언 단일화(배열로만 접근)
        // 2. 출력문구를 반복을 통해서 심플하게 변경

        Student[] students = new Student[2];
        // 새로운 데이터을 저장하기 위한 객체을 만들기 위해
        students[0] = new Student();
        students[0].stuName = "홍길동";
        students[0].stuAge = 15;
        students[0].stuGrade = 90;

        // 새로운 데이터을 저장하기 위한 객체을 만들기 위해
        students[1] = new Student();
        students[1].stuName = "장발장";
        students[1].stuAge = 16;
        students[1].stuGrade = 80;

        for(Student s : students) {
            System.out.printf("이름:%s 나이:%d세 성적:%d점\n",
                    s.stuName, s.stuAge, s.stuGrade);
        }
    }
}
