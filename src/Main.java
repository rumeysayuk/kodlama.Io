public class Main {

    public static void main(String[] args) {
       Student student1=new Student(1,"rumeysa","yuk",252);
       Instructor instructor= new Instructor(5,"Java");
       User user=new User("11111111111111","rumeysa@rumeysa.com");
       StudentManager studentManager =new StudentManager();
       studentManager.add(student1);
       UserManager userManager=new UserManager();
       userManager.add(user);
       InstructorManager instructorManager=new InstructorManager();
       instructorManager.newLesson(instructor);


    }
}
