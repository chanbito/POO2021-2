import java.io.File;
import java.util.Date;

public class demand extends BaseClass{
    private String title;
    private String description;
    private String type;
    private String status;
    private String repository;
    private Date deadline;
    private File file;
    private user owner;
    private team team;
    public demand(String title, String description, String type, String status, String repository, Date deadline,
            File file, user owner, team team) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.status = status;
        this.repository = repository;
        this.deadline = deadline;
        this.file = file;
        this.owner = owner;
        this.team = team;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        update();
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        update();
        this.description = description;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        update();
        this.type = type;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        update();
        this.status = status;
    }
    public String getRepository() {
        return repository;
    }
    public void setRepository(String repository) {
        update();
        this.repository = repository;
    }
    public Date getDeadline() {
        return deadline;
    }
    public void setDeadline(Date deadline) {
        update();
        this.deadline = deadline;
    }
    public File getFile() {
        return file;
    }
    public void setFile(File file) {
        update();
        this.file = file;
    }
    public user getOwner() {
        return owner;
    }
    public void setOwner(user owner) {
        update();
        this.owner = owner;
    }
    public team getTeam() {
        return team;
    }
    public void setTeam(team team) {
        update();
        this.team = team;
    }
    @Override
    public String toString() {
        return "demand [deadline=" + deadline + ", description=" + description + ", file=" + file.toPath().getFileName().toString() + ", owner=" + owner.toString()
                + ", repository=" + repository + ", status=" + status + ", team=" + team + ", title=" + title + ", type=" + type + ", " + GetStringDates() +"]";
    }
}