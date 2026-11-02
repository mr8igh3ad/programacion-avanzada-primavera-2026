package fcc.Actividad20;

/** Estudiante independiente utilizado en el ejemplo de agregación. */
public class Student {
    private final String studentName;
    private final int studentId;

    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }
}
