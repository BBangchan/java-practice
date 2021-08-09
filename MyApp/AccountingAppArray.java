
public class AccountingAppArray {
    
    public static void main(String[] args){

        double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
        
        //... 1억줄의 코드가 있고, rate 값을 다른 것으로 바꾸면 코드가 이상하게 된다.
        double[] dividendRates = new double[3]; // 더블형 3개를 담을수 있는 배열이 만들어짐.
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;
        
        double dividend1 = income * dividendRates[0];
        double dividend2 = income * dividendRates[1];
        double dividend3 = income * dividendRates[2];

        System.out.println("Value of supply : " +valueOfSupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);
        System.out.println("Dividend 1: " + dividend1);
        System.out.println("Dividend 2: " + dividend2);
        System.out.println("Dividend 3: " + dividend3);
        
    }
}
