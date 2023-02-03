import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Model {
    static File file = new File("test.csv");
    static void write(int age, String name, String major){
        /*
        System.out.println("here");
        try {
            FileWriter fileWriter = new FileWriter("test.csv",true);
            fileWriter.write(age+","+name+","+major+"/n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
         */
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            CSVWriter writer = new CSVWriter(fileWriter);
            String[] data = {name, String.valueOf(age), major};
            writer.writeNext(data);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
