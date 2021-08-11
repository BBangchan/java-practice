package ProjectMethod;

import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod{
                                     // 매개변수, parameter
    public static void printTwoTimesA(String text, String delimiter){ // 같은 동작을 여러번 반복하는 것을 편하게 하기 위해서 method로 만들었다.
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }
  
    public static String twoTimes(String text, String delimeter){
        String out = "";
        out  = out + delimeter + "\n";
        out  = out + text + "\n";
        out  = out + text + "\n";
        return out;
    }

    public static void main(String[] args) throws IOException { // main이라는 이름을 가진 method이다.
                       //인자, argument
        printTwoTimesA("a","-");
        System.out.println(twoTimes("a", "-"));
        FileWriter fw = new FileWriter("out.txt");
        fw.write(twoTimes("a", "*"));
        fw.close();
        printTwoTimesA("a","&");
        //Email.send("egoing@a.com", "two times a", twoTimes("a", "&"));
        printTwoTimesA("b","!");

    }
}