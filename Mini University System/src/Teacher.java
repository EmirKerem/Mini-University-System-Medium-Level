public class Teacher extends People {
    private String title;

    public Teacher(String title, String name, String surname, int age) {
        super(name, surname, age);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void show_Info() {
        System.out.println("Teacher's Name = " + getName());
        System.out.println("Teacher's Surname = " + getSurname());
        System.out.println("Teacher's Age = " + getAge());
        System.out.println("Teacher's Title = " + getTitle());
    }
}
