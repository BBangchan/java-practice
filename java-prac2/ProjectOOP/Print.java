package ProjectOOP;

/**
 * Print
 */
public class Print {
    public String delimiter = "";
    public Print(String delimiter) { 
        //생성자는 class의 이름과 똑같은 method를 정의하면 된다.
        // datatype을 선언하지도 않는다. 
        this.delimiter = delimiter;
        // this를 사용하면 우리가 생성한 instance를 가르키는 것.
    }
    public void A(){
        System.out.println(this.delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    public void B(){
        System.out.println(this.delimiter);
        System.out.println("B");
        System.out.println("B");
    }
    
}