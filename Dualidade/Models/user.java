public class user extends BaseClass {
    private String name;
    private String email;
    private String password;
    private area _Area;
    private profile _Profile;
    public user(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public area get_Area() {
        return _Area;
    }
    public void set_Area(area _Area) {
        this._Area = _Area;
    }
    public profile get_Profile() {
        return _Profile;
    }
    public void set_Profile(profile _Profile) {
        this._Profile = _Profile;
    }
    @Override
    public String toString() {
        String ret = "user [email=" + email + ", name=" + name + ", password="
                + password + ", " + GetStringDates() +"]";
        if(_Area != null){
            ret += ", Area=" + _Area.toString();
        }
        if(_Profile != null){
            ret += ", Profile=" + _Profile.toString();
        }
        return ret;
    }
}
