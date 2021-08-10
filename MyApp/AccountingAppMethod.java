
public class AccountingAppMethod {
    
    public static double valueOfSupply; // 전역변수로 선언
    public static double vatRate;
    public static double exepenseRate;
    public static void main(String[] args){

        valueOfSupply = 10000.0;
        vatRate = 0.1;
        exepenseRate = 0.3;
        //double valueOfSupply = Double.parseDouble(args[0]);
        //double valueOfSupply = 100000.0; // 지역변수로 선언
        //double vatRate = 0.1; 지역변수로 선언
        //double vat = valueOfSupply * vatRate;
        //double vat = getVAT();  // 위에 vat식을 밑에처럼 간단하게 만드는 설정
        print();

        
    }

    public static double getVAT(){
        return valueOfSupply * vatRate;
    }
    public static double getTotal(){
        return valueOfSupply * getVAT();
    }
    public static double getExpense(){
        return valueOfSupply * exepenseRate;
    }
    public static double getIncome(){
        return valueOfSupply - getExpense();
    }
    public static double getdividend1(){
        return getIncome() * 0.5 ;
    }
    public static double getdividend2(){
        return getIncome() * 0.3 ;
    }
    public static double getdividend3(){
        return getIncome() * 0.2 ;
    }
    public static void print() {
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
