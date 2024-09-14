public class Security extends Worker {

    public Security(int worker_id, String name, String surname, int age) {
        super(worker_id, name, surname, age);
    }

    public void show_Info() {
        System.out.println("Security Guard's Name = " + getName());
        System.out.println("Security Guard's Surname = " + getSurname());
        System.out.println("Security Guard's Age = " + getAge());
        System.out.println("Security Guard ID = " + getWorker_id());
    }
}

