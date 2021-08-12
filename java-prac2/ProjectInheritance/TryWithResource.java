package ProjectInheritance;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
    // try with resource statements
    // checkedExceptionApp에 코드보다
    // try with resource statements를 이용한 코드가 더 좋다.
	public static void main(String[] args) {
            try (FileWriter f = new FileWriter("data.txt")) {
                f.write("Hello");
                f.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
            // close를 하기 전에 예외가 발생할 수 있기 때문에 finally로 처리해야 합니다.
    }
}