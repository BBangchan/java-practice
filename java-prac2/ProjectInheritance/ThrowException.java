package ProjectInheritance;

import java.io.FileWriter;
import java.io.IOException;

/**
 * ThrowException
 */
public class ThrowException {

    public static void main(String[] args) throws IOException { //throws를 쓰면 try catch가 필요없이 사용자에게 미루는 것이다.
        FileWriter f = new FileWriter("./data.txt");
    }
}