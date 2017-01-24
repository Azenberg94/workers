package evilcorp;

import java.util.ArrayList;

/**
 * Created by Az on 24/01/2017.
 */
public class Worker {
    private String name;
    private ArrayList<Task> tasksList;
    private ArrayList<Activity> activitiesList;


    public Worker(String name){
        this.name = name;
        this.tasksList = new ArrayList<Task>();
        this.activitiesList = new ArrayList<Activity>();
    }

    public void addTask(Task t){
        int i = (this.tasksList.size() - 1);

        if(i >= 0)
            this.tasksList.get(i).setDateEndTask(t.getDateStartTask());

        this.tasksList.add(t);
    }

    public void addActivity(Activity a){
        this.activitiesList.add(a);
    }

    public String getName() {
        return name;
    }

    public String getAllActivities(){
        String value = "";

        for(int i = 0; i < this.activitiesList.size(); i++){
            value = value + ", " + activitiesList.get(i).getName() + ", " + activitiesList.get(i).getBegin() + ", " + activitiesList.get(i).getEnd();
        }

        return value;
    }
}