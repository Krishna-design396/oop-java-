import java.util.Scanner;

class Student {

    // Data members (private for encapsulation)
    private String name;
    private int rollNo;
    private int marks1, marks2, marks3;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(int m1, int m2, int m3) {
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getTotal() {
        return marks1 + marks2 + marks3;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter student name: ");
        s.setName(sc.nextLine());

        System.out.print("Enter roll number: ");
        s.setRollNo(sc.nextInt());

        System.out.print("Enter marks for subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks for subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks for subject 3: ");
        int m3 = sc.nextInt();

        s.setMarks(m1, m2, m3);

        // Display result
        System.out.println("\n--- Student Result ---");
        System.out.println("Name     : " + s.getName());
        System.out.println("Roll No  : " + s.getRollNo());
        System.out.println("Total    : " + s.getTotal());
        System.out.println("Average  : " + s.getAverage());

        sc.close();
    }
}
