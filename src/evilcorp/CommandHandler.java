package evilcorp;

import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Az on 24/01/2017.
 */
public class CommandHandler {
    private Factory factory;

    public CommandHandler(Factory factory){
        this.factory = factory;
    }

    public void handleMonoCommand(String args[]){
        if(args.length >= 6){
            String taskName = args[1];
            String worker = args[2];
            String activityName = args[3];
            String begin = args[4];
            String end = args[5];
            String date;

            if(args.length > 6)
                date = args[6];
            else {
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                Date today = new Date();
                date = dateFormat.format(today);
            }

            Worker w = new Worker(worker);
            Activity a  = new Activity(activityName, Integer.valueOf(begin), Integer.valueOf(end));
            Task t = new Task(taskName, date);
            factory.addActivity(w, a);
            factory.addTask(w, t);
        }else
            System.out.println("Il manque des arguments !");
    }

    public static void handleJSONFile(String args[]){
        if(args.length > 1){
            String filename = args[1];

            File myJson = new File(filename);
            JSONObject obj = new JSONObject(myJson);

            JSONArray activities = obj.getJSONArray("activites");
            JSONArray robots = obj.getJSONArray("robots");
            JSONArray workers = obj.getJSONArray("roles");

            for(int i = 0; i < workers.length(); i++){
                // Plus de temps.... :(
            }
        }else
        System.out.println("Il manque des arguments !");
    }
}
