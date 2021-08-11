package ProjectOOP;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP{
    public static void main(String[] args) throws IOException {
        // class : System, Math, FileWriter
        // instance : f1, f2

        System.out.println(Math.PI);  // 한줄인 작업은 class에 있는 method를 사용해서 하면되고,
        System.out.println(Math.floor(1.8888));
        System.out.println(Math.ceil(1.4546));

        FileWriter f1 = new FileWriter("data.txt"); // FileWriter Class를 복제한 Instance
        f1.write("Hello");  //이렇게 긴 맥락이 있는 것은 class를 복제해서 Instance를 제어해서 사용한다.
        f1.write(" JAVA");
        f1.close();

        FileWriter f2 = new FileWriter("data2.txt"); // FileWriter Class를 복제한 Instance
        f2.write("Hello");
        f2.write(" JAVA2");
        f2.close();
    }
}