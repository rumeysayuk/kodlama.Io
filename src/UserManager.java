public class UserManager {
    public void add(User user){
        System.out.println("user added id = "+user.get_id());
    }
    public void delete(User user){
        System.out.println("user deleted id = "+user.get_id());
    }
}
