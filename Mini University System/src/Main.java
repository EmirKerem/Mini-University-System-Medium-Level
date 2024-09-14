import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Rector definition
        Rector rector = new Rector("Mehmet", "Yılmaz", 55, "Prof. Dr.", "He has worked at the university for many years.");
        
        // Deans definition
        Dean dean1 = new Dean("Computer Engineering", "Ayşe", "Kaya", 45, "Assoc. Prof.", "Expert in computer engineering.");
        Dean dean2 = new Dean("Mechanical Engineering", "Selim", "Demir", 50, "Prof. Dr.", "Expert in mechanical engineering.");
        Dean dean3 = new Dean("Electrical Engineering", "Ali", "Kurt", 48, "Prof. Dr.", "Expert in electrical engineering.");

        // Students definition
        Student student1 = new Student("ali@gmail.com", "12345", "Computer Engineering", "3.80", "3", "Ali", "Veli", 20);
        Student student2 = new Student("ayşe@gmail.com", "12346", "Mechanical Engineering", "3.50", "4", "Ayşe", "Yılmaz", 22);
        Student student3 = new Student("mehmet@gmail.com", "12347", "Electrical Engineering", "2.90", "2", "Mehmet", "Demir", 21);
        Student student4 = new Student("zeynep@gmail.com", "12348", "Chemical Engineering", "3.10", "1", "Zeynep", "Kurt", 19);
        Student student5 = new Student("veli@gmail.com", "12349", "Civil Engineering", "2.70", "2", "Veli", "Çelik", 21);

        // Teachers definition
        Teacher teacher1 = new Teacher("Assoc. Prof.", "Ahmet", "Kaya", 40);
        Teacher teacher2 = new Teacher("Asst. Prof.", "Fatma", "Demir", 38);

        // Security guards definition
        Security security1 = new Security(1, "Mustafa", "Çelik", 35);
        Security security2 = new Security(2, "Emine", "Tuna", 40);

        // Workers definition
        Worker worker1 = new Worker(101, "Hasan", "Yılmaz", 30);
        Worker worker2 = new Worker(102, "Sevim", "Koç", 28);
        Worker worker3 = new Worker(103, "Cem", "Aslan", 32);

        while (true) {
            System.out.println("Welcome to the University Management Platform...");
            System.out.println("*********************************************");

            System.out.println("Select the department you want to access:");
            System.out.println("1-Rector\n"
                    + "2-Dean\n"
                    + "3-Teacher\n"
                    + "4-Student\n"
                    + "5-Worker\n"
                    + "6-Security\n"
                    + "7-Exit System");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Clear the Enter key

            switch (choice) {
                case 1:
                    rector.show_Info();
                    rector.biography();
                    break;

                case 2:
                    System.out.println("Which Dean's information would you like to see? (1-3)");
                    int deanChoice = scanner.nextInt();
                    scanner.nextLine();  // Clear the Enter key
                    if (deanChoice == 1) {
                        dean1.show_Info();
                        dean1.biography();
                    } else if (deanChoice == 2) {
                        dean2.show_Info();
                        dean2.biography();
                    } else if (deanChoice == 3) {
                        dean3.show_Info();
                        dean3.biography();
                    } else {
                        System.out.println("Invalid selection!");
                    }
                    break;

                case 3:
                    System.out.println("Which Teacher's information would you like to see? (1-2)");
                    int teacherChoice = scanner.nextInt();
                    scanner.nextLine();  // Clear the Enter key
                    if (teacherChoice == 1) {
                        teacher1.show_Info();
                    } else if (teacherChoice == 2) {
                        teacher2.show_Info();
                    } else {
                        System.out.println("Invalid selection!");
                    }
                    break;

                case 4:
                    System.out.println("Which Student's information would you like to see? (1-5)");
                    int studentChoice = scanner.nextInt();
                    scanner.nextLine();  // Clear the Enter key
                    if (studentChoice == 1) {
                        student1.show_Info();
                    } else if (studentChoice == 2) {
                        student2.show_Info();
                    } else if (studentChoice == 3) {
                        student3.show_Info();
                    } else if (studentChoice == 4) {
                        student4.show_Info();
                    } else if (studentChoice == 5) {
                        student5.show_Info();
                    } else {
                        System.out.println("Invalid selection!");
                    }
                    break;

                case 5:
                    System.out.println("Which Worker's information would you like to see? (1-3)");
                    int workerChoice = scanner.nextInt();
                    scanner.nextLine();  // Clear the Enter key
                    if (workerChoice == 1) {
                        worker1.show_Info();
                    } else if (workerChoice == 2) {
                        worker2.show_Info();
                    } else if (workerChoice == 3) {
                        worker3.show_Info();
                    } else {
                        System.out.println("Invalid selection!");
                    }
                    break;

                case 6:
                    System.out.println("Which Security Guard's information would you like to see? (1-2)");
                    int securityChoice = scanner.nextInt();
                    scanner.nextLine();  // Clear the Enter key
                    if (securityChoice == 1) {
                        security1.show_Info();
                    } else if (securityChoice == 2) {
                        security2.show_Info();
                    } else {
                        System.out.println("Invalid selection!");
                    }
                    break;

                case 7:
                    System.out.println("Exiting the system...");
                    return;

                default:
                    System.out.println("Invalid selection, please try again.");
            }
            System.out.println("*********************************************");
        }
    }
}
