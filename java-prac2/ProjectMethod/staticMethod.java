package ProjectMethod;

class Print{
    public String delimiter;
    public void a(){
        System.out.println(this.delimiter);
        System.out.println("a");
        System.out.println("a");
    }
    public void b(){
        System.out.println(this.delimiter);
        System.out.println("b");
        System.out.println("b");
    }
    public static void c(String delimiter){
        System.out.println(delimiter);
        System.out.println("c");
        System.out.println("c");
    }
}
public class staticMethod{
    
    public static void main(String[] args) {
        // Print.a("-");  // a와 b가 성질이 비슷하므로 이러한 method들을 Class로 묶어서 정의한다.
        // Print.b("-"); //각각의 method마다 구분자를 인자로 줘야 했었다.
        
        // instance
        Print t1 = new Print(); // t1은 Print라는 Class의 instance이다.
        t1.delimiter = "-";
        t1.a();  // method가 instance의 소속일때에는 static을 빼주어야 한다.
        t1.b();  // method가 class의 소속일때에는 static을 넣어 주어야한다.
        //Print.a(); // 이게 안되는이유는 a는 Class소속이 아니라 instance 소속이므로 동작하지 않는다.
        Print.c("$"); // Print라는 Class의 소속이기 때문에 이렇게 호출이 가능하다.

        // Print.a("*");
        // Print.b("*");
        Print t2 = new Print();
        t2.delimiter = "*";
        t2.a();
        t2.b();
    }

}