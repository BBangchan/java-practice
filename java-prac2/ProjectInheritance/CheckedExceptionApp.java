package ProjectInheritance;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {
    // try catch 방법
	public static void main(String[] args) {
        FileWriter f = null; // fileWriter 변수 f를 선언
		try {
			f = new FileWriter("data.txt");
			f.write("Hello");
            // close를 하기 전에 예외가 발생할 수 있기 때문에 finally로 처리해야 합니다.
		} 
        catch(IOException e) {
			e.printStackTrace();
		}
        finally{
            // 만약에 f가 null이 아니라면
            if(f != null){
                try{
                f.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
            
        } 
	}

}