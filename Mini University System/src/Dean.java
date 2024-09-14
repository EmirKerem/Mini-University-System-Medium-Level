public class Dean extends Rector {
    private String department;

    public Dean(String department, String name, String surname, int age, String title, String biography) {
        super(name, surname, age, title, biography);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void biography() {
        System.out.println("Dean's Biography: " + getBiography());
    }

    public void show_Info() {
        System.out.println("Dean's Name = " + getName());
        System.out.println("Dean's Surname = " + getSurname());
        System.out.println("Dean's Age = " + getAge());
        System.out.println("Dean's Title = " + getTitle());
    }
}
