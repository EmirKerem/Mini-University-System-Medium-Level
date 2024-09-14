public class Worker extends People {
    private int worker_id;

    public Worker(int worker_id, String name, String surname, int age) {
        super(name, surname, age);
        this.worker_id = worker_id;
    }

    public int getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(int worker_id) {
        this.worker_id = worker_id;
    }

    public void show_Info() {
        System.out.println("Worker's Name = " + getName());
        System.out.println("Worker's Surname = " + getSurname());
        System.out.println("Worker's Age = " + getAge());
        System.out.println("Worker ID = " + getWorker_id());
    }
}
