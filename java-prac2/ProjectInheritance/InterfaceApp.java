package ProjectInheritance;

/**
 * InterfaceApp
 */
interface Calculable{ // class의 형태를 규정한다.
    // interface에는 method와 변수가 들어갈 수 있는데, 형태를 만족하는 method를 직접 구현해야 한다.
    double PI = 3.14;
    int sum(int v1, int v2);
}
interface Printable{
    void print();
}
class RealCal implements Calculable,Printable{ // class하나의 여러개의 interface를 구현할 수 있다.
    public int sum(int v1, int v2){
        return v1+v2;
    }
    public void print(){
        System.out.println("This is RealCal!!");
    }
}
class AdvancedPrint implements Printable{ // class하나의 여러개의 interface를 구현할 수 있다.
    public void print(){
        System.out.println("This is AdvancedPrint!!");
    }
}

public class InterfaceApp {
    public static void main(String[] args) {
        Printable c = new RealCal(); //RealCal이 C변수에서는 Printable로만 사용이 된다. 나머지 기능은 감춰진다.
        Printable d = new AdvancedPrint(); // Printable 변수로 사용하면 = new 뒤에는 Printable이라고 쓰여진 class는 모두 사용이 가능하다.
        // 호환성이 좋다.
        c.print();
        d.print();
    }
    
}