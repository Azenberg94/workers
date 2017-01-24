package evilcorp;

import java.io.*;

/**
 * Created by Az on 24/01/2017.
 */
public class EvilLogger {
    String filename = "logfile.csv";

    public void write(String content){
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename), "UTF-8"));
            StringBuffer oneLine = new StringBuffer();
            System.out.println(content);
            oneLine.append(content);
            bw.newLine();

            bw.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
