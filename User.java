class Student extends User {
    private String courseName;

    public Student(int id, String name, String courseName) {
        super(id, name);
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public void display() {  // Polymorphism
        System.out.println("Student ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Course: " + courseName);
    }
}