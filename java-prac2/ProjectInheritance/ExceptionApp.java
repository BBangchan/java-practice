package ProjectInheritance;

/**
 * ExceptionApp
 */
public class ExceptionApp {

    public static void main(String[] args) {
        System.out.println(1);
        int[] scores = {10,20,30};
        try{
            System.out.println(2);
            //System.out.println(scores[3]); // 예외가 발생하면 그 try 밑에 줄은 실행이 되지 않는다.
            System.out.println(2/0); // 예외적인 상황 발생
            System.out.println(4);
        } 
        catch(ArithmeticException e){
            System.out.println("잘못된 계산"+ e.getMessage()); // 간단히 error 문제를 알려준다.
            e.printStackTrace(); // error message를 알려준다.
        }
        catch(Exception e){ // 예외는 상속을 통한 부모자식이 있는데 부모를 갖다 놓으면 우선순위로 따져서 실행이된다.
            // 근데 ArithmeticException이 앞에 있으면 ArithmeticException이 실행되지만 부모 Exception은 자식 Exception을 다 포함한다.
            System.out.println("오류가 발생했습니다.");
        }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("없는 값을 찾는중");
        // }
        // catch(ArithmeticException e){
        //     System.out.println("잘못된 계산");
        // }

        System.out.println(5);
    }
}