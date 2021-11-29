import javax.imageio.ImageIO;

public class profile extends BaseClass {
    private String type;
    private ImageIO photo;
    private String phone;
    private String biografy;
    private String git;
    public profile(String type, ImageIO photo, String phone, String biografy, String git) {
        this.type = type;
        this.photo = photo;
        this.phone = phone;
        this.biografy = biografy;
        this.git = git;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        update();
        this.type = type;
    }
    public ImageIO getPhoto() {
        return photo;
    }
    public void setPhoto(ImageIO photo) {
        update();
        this.photo = photo;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        update();
        this.phone = phone;
    }
    public String getBiografy() {
        return biografy;
    }
    public void setBiografy(String biografy) {
        update();
        this.biografy = biografy;
    }
    public String getGit() {
        return git;
    }
    public void setGit(String git) {
        update();
        this.git = git;
    }
    @Override
    public String toString() {
        return "profile [biografy=" + biografy + ", git=" + git + ", phone=" + phone + ", photo=" + photo + ", type="
                + type + ", "+ this.GetStringDates() +"]";
    }
}
