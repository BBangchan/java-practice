class Accounting{
    public double valueOfSupply; // 전역변수로 선언
    public double vatRate;
    public double exepenseRate;
    public double getVAT(){
        return valueOfSupply * vatRate;
    }
    public double getTotal(){
        return valueOfSupply + getVAT();
    }
    public double getExpense(){
        return valueOfSupply * exepenseRate;
    }
    public double getIncome(){
        return valueOfSupply - getExpense();
    }
    public double getdividend1(){
        return getIncome() * 0.5 ;
    }
    public double getdividend2(){
        return getIncome() * 0.3 ;
    }
    public double getdividend3(){
        return getIncome() * 0.2 ;
    }
    public void print() {
        System.out.println("Value of supply : " +valueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal());
        System.out.println("Expense : " + getExpense());
        System.out.println("Income : " + getIncome());
        System.out.println("Dividend 1: " + getdividend1());
        System.out.println("Dividend 2: " + getdividend2());
        System.out.println("Dividend 3: " + getdividend3());
    }
}

public class AccountingAppClass {
    
    public static void main(String[] args){

        Accounting a1 = new Accounting(); // Accouting을 복제하는 것
        a1.valueOfSupply = 10000.0;
        a1.vatRate = 0.1;
        a1.exepenseRate = 0.3;
        a1.print();

        Accounting a2 = new Accounting();  // 클래스를 따로 복제하지 않아도 new를 이용해서 사용하는것을 instance라고 한다.
        a2.valueOfSupply = 20000.0;        // 그리고 instance를 사용할때에는 Class에 static을 모두 지워야 한다.
        a2.vatRate = 0.05;
        a2.exepenseRate = 0.2;
        a2.print();

        a1.print();
    }

}
