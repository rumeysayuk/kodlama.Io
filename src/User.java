public class User {
    private String id;
    private String eMail;

    public User() {
    }

    public User(String id, String eMail) {
        this.id = id;
        this.eMail=eMail;
    }

    public String get_id() {
        return id;
    }
    public String get_eMail() {
        return eMail;
    }
    public void set_eMail(String eMail) {
        this.eMail = eMail;
    }
}
