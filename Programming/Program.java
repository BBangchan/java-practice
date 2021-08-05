import java.io.IOException;
import java.io.PrintWriter;

// public class Program {  //상상력
//     public static void main(String[] args){

//         System.out.println(1);
//         System.out.println(2);
//         System.out.println(3);

//     }
// }

// _____________________________________________________________________
// class 연습
// public class Program {

//     public static void main(String[] args) {

//         System.out.println(Math.PI);
//         System.out.println(Math.floor(1.6));
//         System.out.println(Math.ceil(1.6));
//     }

// }
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Program {

    public static void main(String[] args) throws IOException{ 
    
        PrintWriter p1 = new PrintWriter("result1.txt"); // p1은 
        p1.write("Hello 1");
        p1.close();

        PrintWriter p2 = new PrintWriter("result2.txt"); // p1은  
        p2.write("Hello 2");
        p2.close();

    }
}