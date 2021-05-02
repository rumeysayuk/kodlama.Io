public class InstructorManager extends UserManager{

    public void newLesson(Instructor instructor){
     System.out.println("yeni ders ekledi. Ders adi : "+instructor.getLesson());
 }
 public void remove(Instructor instructor){
     System.out.println(" ders silindi. Ders adi : "+instructor.getLesson());
 }

}
