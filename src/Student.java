public class Student {
    private String name;
    private int studentCode;
    private String dateOfBirth;
    private String grade;

    public Student(){}

    public Student(String name, int studentCode, String dateOfBirth, String grade) {
        this.name = name;
        this.studentCode = studentCode;
        this.dateOfBirth = dateOfBirth;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentCode=" + studentCode +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
