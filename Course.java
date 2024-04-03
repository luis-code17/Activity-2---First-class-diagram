package activity2;

public class Course {
    private Student[] students;

    public Course() {
    }

    public int countStudents() {
        return this.students != null ? this.students.length : 0;
    }
}