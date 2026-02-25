class Student {
    String name;
    int[] marks;

     Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
    double calculateAverage() {
        if (marks.length == 0) {
            return 0;
        }
        return (double) calculateTotal() / marks.length;
    }
    void display() {
        System.out.println("Student Name: " + name);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nTotal Marks: " + calculateTotal());
        System.out.println("Average Marks: " + calculateAverage());
    }

    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};
        Student s1 = new Student("John", marks);
        s1.display();
    }
}
