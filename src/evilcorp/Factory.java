package evilcorp;

/**
 * Created by Az on 24/01/2017.
 */
public class Factory {
    EvilLogger evilLogger = new EvilLogger();

    public void addActivity(Worker w, Activity a){
        w.addActivity(a);
    }

    public void addTask(Worker w, Task t){
        w.addTask(t);
        String content = "evilcorp.Activity," + t.toString() + "," + w.getName()  + w.getAllActivities();
        this.evilLogger.write(content);
    }

}