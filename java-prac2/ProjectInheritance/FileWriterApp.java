package ProjectInheritance;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * FileWriterApp
 */
public class FileWriterApp {
    // Close method는 AutoCloseable interface에 선언이 되어 있는 method이기 때문에 fileWriter와 같은 곳에서도 close가 사용이 가능하다.
    public static void main(String[] args) throws IOException {
        Writer fileWriter = new FileWriter("filewriter.txt");

        fileWriter.write("data 1");
        fileWriter.write("data 2");
        fileWriter.write("data 3");

        fileWriter.close();
    }
}