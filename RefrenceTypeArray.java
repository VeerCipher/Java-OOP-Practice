class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {

        // Create an array of Student references
        Student[] students = new Student[3];

        // Create objects and store their references
        students[0] = new Student("Ali", 85);
        students[1] = new Student("Ahmed", 90);
        students[2] = new Student("Usman", 78);

        // Display all students
        for (int i = 0; i < students.length; i++) {
            students[i].display();
            System.out.println("----------");
        }
    }
}
