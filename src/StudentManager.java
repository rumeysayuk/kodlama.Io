public class StudentManager extends UserManager {


    public void add(Student student) {
        System.out.println("Student added : "+student.getFirstName());
    }

    public void delete(Student student) {
        System.out.println("Student deleted : "+student.getFirstName());
    }
}
