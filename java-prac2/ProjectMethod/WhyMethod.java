package ProjectMethod;
public class WhyMethod{
                                     // 매개변수, parameter
    public static void printTwoTimesA(String text, String delimiter){ // 같은 동작을 여러번 반복하는 것을 편하게 하기 위해서 method로 만들었다.
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }
    public static void main(String[] args){ // main이라는 이름을 가진 method이다.
                       //인자, argument
        printTwoTimesA("a","-");
        printTwoTimesA("a","*");
        printTwoTimesA("a","&");
        printTwoTimesA("b","!");

    }
}