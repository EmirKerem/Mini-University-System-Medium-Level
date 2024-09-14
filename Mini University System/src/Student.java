public class Student extends People {
    private String mail;
    private String student_id;
    private String department;
    private String grade;
    private String class_;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getClass_() {
        return class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    public Student(String mail, String student_id, String department, String grade, String class_, String name, String surname, int age) {
        super(name, surname, age);
        this.mail = mail;
        this.student_id = student_id;
        this.department = department;
        this.grade = grade;
        this.class_ = class_;
    }

    public void show_Info() {
        System.out.println("Student's Name = " + getName());
        System.out.println("Student's Surname = " + getSurname());
        System.out.println("Student's Age = " + getAge());
        System.out.println("Student's Email Address = " + getMail());
        System.out.println("Student ID = " + getStudent_id());
        System.out.println("Student's Faculty = " + getDepartment());
        System.out.println("Student's GPA = " + getGrade());
        System.out.println("Student's Class = " + getClass_());
    }
}
