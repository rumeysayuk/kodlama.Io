public class Student extends User {
    private int studentId;
    private String firstName;
    private String lastName;
    private int schoolNumber;

    public Student(int studentId,String firstName,String lastName,int schoolNumber) {

        this.studentId=studentId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.schoolNumber=schoolNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }


}
