
public class AccountingAppArrayLoop {
    
    public static void main(String[] args){

        double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
        
       

        System.out.println("Value of supply : " +valueOfSupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);

       
         //... 1억줄의 코드가 있고, rate 값을 다른 것으로 바꾸면 코드가 이상하게 된다.
         double[] dividendRates = new double[3]; // 더블형 3개를 담을수 있는 배열이 만들어짐.
         dividendRates[0] = 0.5;
         dividendRates[1] = 0.3;
         dividendRates[2] = 0.2;
       
        
         int i = 0; //몇번 반복되었는지 기록하는 변수
         while(i < dividendRates.length) { // 반복문
            System.out.println("Dividend: " + income * dividendRates[i]);
            i = i + 1;
         }
    }
}
