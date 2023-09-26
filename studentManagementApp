import java.util.ArrayList;
import java.util.Scanner;

public class studentManagementApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        /*
         * This is the main method that initiates the student management application.
         */
        System.out.println("STUDENT MANAGEMENT APPLICATION");
        System.out.println("**********************************");
        System.out.println("PRESS 1 TO ENTER MENU OR ANY OTHER KEY TO EXIT");

        String input = scanner.nextLine();

        if (input.equals("1")) {
            displayMenu();
        } else {
            System.out.println("Goodbye!");
        }

        scanner.close();
    }

    /*
     * Display the main menu and handle user input.
     */
    private static void displayMenu() {
        while (true) {
            System.out.println("\nPlease select one of the menu items:");
            System.out.println("(1) Capture a new student.");
            System.out.println("(2) Search for a student.");
            System.out.println("(3) Delete a student.");
            System.out.println("(4) Print student report.");
            System.out.println("(5) Exit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    captureStudent();
                    break;
                case "2":
                    searchStudent();
                    break;
                case "3":
                    deleteStudent();
                    break;
                case "4":
                    printStudentReport();
                    break;
                case "5":
                    exitStudentApplication();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
    
    /*
     * Capture information for a new student and add them to the list.
     */
    private static void captureStudent() {
    System.out.println("\nCAPTURE A NEW STUDENT");
    System.out.println("**************************************");

    int id;
    while (true) {
        try {
            System.out.print("Enter student id: ");
            id = Integer.parseInt(scanner.nextLine());

            // Check if the ID already exists
            boolean idExists = false;
            for (Student student : students) {
                if (student.getId() == id) {
                    idExists = true;
                    break;
                }
            }

            if (!idExists) {
                break;
            } else {
                System.out.println("Student with this ID already exists. Please enter a different ID.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    System.out.print("Enter student name: ");
    String name = scanner.nextLine();

    int age;
    while (true) {
        try {
            System.out.print("Enter student age (must be higher than 16): ");
            age = Integer.parseInt(scanner.nextLine());
            if (age >= 16) {
                break;
            } else {
                System.out.println("Invalid age. Please enter a valid age.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    System.out.print("Enter student email: ");
    String email = scanner.nextLine();

    System.out.print("Enter student course: ");
    String course = scanner.nextLine();

    Student student = new Student(id, name, age, email, course);
    students.add(student);

    System.out.println("Student details have been successfully saved.");

    System.out.print("Enter 1 to return to the menu or any other key to exit: ");
    String choice = scanner.nextLine();
    if (!choice.equals("1")) {
        System.out.println("Goodbye!");
        System.exit(0);
    }
}


    /*
     * Search for a student by their ID.
     */
    private static void searchStudent() {
        System.out.println("\nSEARCH FOR A STUDENT");
        System.out.println("**************************************");
        System.out.print("Enter student ID to search: ");
        int searchId = Integer.parseInt(scanner.nextLine());

        boolean found = false;
        for (Student student : students) {
            if (student.getId() == searchId) {
                System.out.println("Student Found:");
                System.out.println(student.toString());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        System.out.print("Enter 1 to return to the menu or any other key to exit: ");
        String choice = scanner.nextLine();
        if (!choice.equals("1")) {
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }

    /*
     * Delete a student by their ID.
     */
    private static void deleteStudent() {
        System.out.println("\nDELETE A STUDENT");
        System.out.println("**************************************");
        System.out.print("Enter student ID to delete: ");
        int deleteId = Integer.parseInt(scanner.nextLine());

        boolean found = false;
        for (Student student : students) {
            if (student.getId() == deleteId) {
                System.out.println("Student Found:");
                System.out.println(student.toString());
                found = true;

                System.out.print("Are you sure you want to delete this student? (yes/no): ");
                String confirmation = scanner.nextLine().toLowerCase();

                if (confirmation.equals("yes")) {
                    students.remove(student);
                    System.out.println("Student deleted successfully.");
                } else {
                    System.out.println("Deletion canceled.");
                }

                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        System.out.print("Enter 1 to return to the menu or any other key to exit: ");
        String choice = scanner.nextLine();
        if (!choice.equals("1")) {
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }

    /*
     * Print a report of all students.
     */
    private static void printStudentReport() {
        System.out.println("\nSTUDENT REPORT");
        System.out.println("**************************************");

        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.print("Enter 1 to return to the menu or any other key to exit: ");
        String choice = scanner.nextLine();
        if (!choice.equals("1")) {
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }

    /*
     * Exit the student application.
     */
    private static void exitStudentApplication() {
        System.out.println("Goodbye!");
        System.exit(0);
    }
}

class Student {
    private int id;
    private String name;
    private int age;
    private String email;
    private String course;

    /*
     * Constructor for the Student class.
     */
    public Student(int id, String name, int age, String email, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    /*
     * Getter method for student ID.
     */
    public int getId() {
        return id;
    }

    /*
     * Override the toString() method to display student information.
     */
    @Override
    public String toString() {
        return "Student ID: " + id + "\nName: " + name + "\nAge: " + age + "\nEmail: " + email + "\nCourse: " + course + "\n";
    }
}
//*****************************************************************************END OF FILE*********************************************************************************//
