import java.util.Scanner;

class Student {
    String name;
    int id;
    double marks;

    public static void printInfo(Student s) {
        System.out.println(" The name of the student is: " + s.name);
        System.out.println(" The ID of the student is: " + s.id);
        System.out.println(" The marks of the student is: " + s.marks);
    }

    public static boolean hasPassed(Student s) {
        if (s.marks >= 50) {
            return true;
        }
        else {
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print(" Enter the number of students: ");
        n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();

            System.out.printf(" Enter the name of the student %d: ", i + 1);
            students[i].name = sc.nextLine();
            sc.nextLine();

            System.out.printf(" Enter the ID of the student %d: ", i + 1);
            students[i].id = sc.nextInt();

            System.out.printf(" Enter the marks of the student %d: ", i + 1);
            students[i].marks = sc.nextDouble();

            sc.nextLine();
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            Student.printInfo(students[i]);
            boolean isPassed = Student.hasPassed(students[i]);
            if (isPassed) {
                System.out.println(" The student " + students[i].name + " has been passed!");
            }
            else {
                System.out.println(" The student " + students[i].name + " has been not passed!");
            }
            System.out.println("\n");
        }
        sc.close();
    }
}