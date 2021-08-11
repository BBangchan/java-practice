public class LogicalOperatorApp {
    
    public static void main(String[] args){
        // and 연산자
        System.out.println(1 <= 1);
        System.out.println(true && true); // true
        System.out.println(true && false); // False
        System.out.println(false && true); // False
        System.out.println(false && false); // False  
        
        // OR 연산자
        System.out.println(true || true); //true
        System.out.println(true || false); //true
        System.out.println(false || true); //true
        System.out.println(false || false); //false

        // Not 연산자
        System.out.println(!true); //false
        System.out.println(!false);//true
    }
}