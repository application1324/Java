public class Student {

    private int grade;
    private String name;
    private String gender;
    private String phone;

    public Student() {}

    public Student(int grade, String name, String gender, String phone) {
        this.grade = grade;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }

    public Student(int grade, String name, String gender) {
        this.grade = grade;
        this.name = name;
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void studentInfo() {
        System.out.println(this.name+"학생은 "+this.grade+"학년이며, 성별은 "+this.gender+", 전화번호는 "+this.phone+"입니다.");
    }

    public void upGrade() {
        this.grade++;
    }

}
