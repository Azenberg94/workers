package evilcorp;

/**
 * Created by Az on 24/01/2017.
 */
public class Activity {

    private String name;
    private int begin;
    private int end;

    public Activity(String name, int begin, int end) {
        this.name = name;
        this.begin = begin;
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
