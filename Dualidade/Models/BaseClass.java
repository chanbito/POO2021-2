import java.time.LocalTime;

public abstract class BaseClass{
    private LocalTime created_on;
    private LocalTime updated_on;
    public BaseClass() {
        this.setCreated_on();
        this.update();
    }
    public LocalTime getUpdated_on() {
        return updated_on;
    }
    protected void update() {
        this.updated_on = LocalTime.now();
    }
    public LocalTime getCreated_on() {
        return created_on;
    }
    private void setCreated_on() {
        this.created_on = LocalTime.now();
    }
    public String GetStringDates() {
        return " created_on=" + created_on + ", updated_on=" + updated_on + " ";
    }

    
}