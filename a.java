import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\IdeaProjects\\untitled1\\src\\data.txt");
        try {
            Scanner sc = new Scanner(file);
            double min = 0;
            int i = 0;
            while(sc.hasNextLine()){
                double a = sc.nextDouble();
                if(i == 0){
                    min = a;
                    i++;
                }else {
                    if(a < min){
                        min = a;
                    }
                }
            }
            int output = (int) Math.round(min);
            FileWriter fileWriter = new FileWriter("min.txt");
            fileWriter.write(String.valueOf(output));
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
