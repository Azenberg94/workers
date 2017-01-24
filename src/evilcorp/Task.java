package evilcorp;

/**
 * Created by Az on 24/01/2017.
 */
public class Task {

    public String name;
    private String dateStartTask;
    private String dateEndTask;

    public Task (String name, String dateStartTask){
        this.name = name;
        this.dateStartTask=dateStartTask;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateStartTask() {
        return dateStartTask;
    }

    public void setDateEndTask(String dateEndTask) {
        this.dateEndTask = dateEndTask;
    }

    @Override
    public String toString() {
        return name + "," + dateStartTask;
    }
}