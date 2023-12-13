import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList();

        students.add(new Student(3, "김회장", "여", "010-1234-1234"));
        students.add(new Student(3, "이총무", "남", "010-1234-5678"));
        students.add(new Student(2, "유부장", "남", "010-5678-5678"));
        students.add(new Student(1, "최신입", "여"));

        System.out.println("2023학년도 학생현황");
        for(Student student : students) {
            if(student.getPhone() == null) {
                student.setPhone("없음");
            }
            student.studentInfo();
            student.upGrade();
        }

        System.out.println("2024학년도 학생현황");

        int num = 0;
        for(int i=0; i<students.size(); i++) {

            if(students.get(i).getGrade() >= 4) {
                students.remove(students.indexOf(students.get(i)));
                i--;
            }

        }

        for(Student student : students) {
            student.studentInfo();
        }
    }
}
