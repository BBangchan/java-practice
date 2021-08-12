package ProjectOOP;

class Accounting{  // class를 이용해서 서로 같은 의미에 변수와 메소드를 모아서 정리 할 수 있다.
    public double valueOfSupply;
    public static double vatRate = 0.1;  // 부가가치세율은 같기 때문에 instance 소속이 아닌 class소속으로 하는게 좋다.
    // vatRate의 값을 바꾸면 모든 instance에 있는 vatRate의 값들도 변경된다.
    public Accounting(double valueOfSupply){  // 생성자를 이용해서 코드를 더욱 편하게 사용할 수 있다.
        this.valueOfSupply = valueOfSupply;
    }
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}
public class AccountingApp {
    public static void main(String[] args) { // class의 상태가 계속해서 바뀌어야하는 상황이면 instance를 활용한다.
        // 이러한 상황은 class하나를 이용해서 상태를 계속 변경해야 되어서 힘들기 때문에
        // instance를 이용한다.
        Accounting a1 = new Accounting(10000.0);
    
        Accounting a2 = new Accounting(20000.0);
    

        System.out.println("Value of supply : " + a1.valueOfSupply);
        System.out.println("Value of supply : " + a2.valueOfSupply);
        System.out.println("VAT : " + a1.getVAT());
        System.out.println("VAT : " + a2.getVAT());
        System.out.println("Total : " + a1.getTotal());
        System.out.println("Total : " + a2.getTotal());
        // 아래의 class 하나만으로 사용한 코드를 instance를 사용하면 위에서처럼 간단하게 사용 할 수 있다.
        // 버그의 위험도 적다.

        // Accounting.valueOfSupply = 10000.0;
        // System.out.println("Value of supply : " + Accounting.valueOfSupply);
        // Accounting.valueOfSupply = 20000.0;
        // System.out.println("Value of supply : " + Accounting.valueOfSupply);

        // Accounting.valueOfSupply = 10000.0;
        // System.out.println("VAT : " + Accounting.getVAT());
        // Accounting.valueOfSupply = 20000.0;
        // System.out.println("VAT : " + Accounting.getVAT());
        
        // Accounting.valueOfSupply = 10000.0;
        // System.out.println("Total : " + Accounting.getTotal());
        // Accounting.valueOfSupply = 20000.0;
        // System.out.println("Total : " + Accounting.getTotal());
 
    }
}