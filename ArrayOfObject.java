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
        System.out.println("----------------");
    }

    public static void main(String[] args) {

        // Create an array for 3 Student references
        Student[] std = new Student[3];

        // Create Student objects
        std[0] = new Student("Ali", 85);
        std[1] = new Student("Ahmed", 90);
        std[2] = new Student("Usman", 78);

        // Display all students using a loop
        for (int i = 0; i < std.length; i++) {
            std[i].display();
        }
    }
}
