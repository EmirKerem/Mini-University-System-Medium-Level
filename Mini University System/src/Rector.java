public class Rector extends People {
    private String title;
    private String biography;

    public Rector(String name, String surname, int age, String title, String biography) {
        super(name, surname, age);
        this.title = title;
        this.biography = biography;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public void biography() {
        System.out.println("Rector's Biography: " + biography);
    }

    public void show_Info() {
        System.out.println("Rector's Name = " + getName());
        System.out.println("Rector's Surname = " + getSurname());
        System.out.println("Rector's Age = " + getAge());
        System.out.println("Rector's Title = " + getTitle());
    }
}
