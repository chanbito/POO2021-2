import java.util.ArrayList;

public class team extends BaseClass {
    private String name;
    private String email;
    private user owner;
    private ArrayList<user> users;
    public team(String name, String email, user owner) {
        this.name = name;
        this.owner = owner;
        this.setEmail(email);
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        update();
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        update();
        this.name = name;
    }
    public user getOwner() {
        return owner;
    }
    public void setOwner(user owner) {
        update();
        this.owner = owner;
    }
    public ArrayList<user> getUsers() {
        return users;
    }
    public void addUsers(user user) {
        update();
        if(users == null){
            users = new ArrayList<user>();
        }
        users.add(user);
    }
    @Override
    public String toString() {
        return "team [name=" + name + ", owner=" + owner.toString() + ", users=" + users.toString() + ", " + GetStringDates() +"]";
    } 
}
