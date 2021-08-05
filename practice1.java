// public class practice1 {
//     public static void main(String args[]) {

//         System.out.println("Hello World!!");
//     }
// }
// ____________________________________________________________________________________________________________
// public class practice1{
//     public static void main(String[] args){

//     System.out.println(6);  //Number
//     System.out.println("six"); //String

//     System.out.println("6"); //String 6
//     System.out.println(6+6); // 12 숫자끼리 더한 더하기 연산자
//     System.out.println("6"+"6"); // 66  문자열을 결합해주는 연산자

//     System.out.println(6*6); //36
//   //  System.out.println("6"*"6");  //문자열은 *연산 불가능
//     System.out.println("1111".length());  //문자열의 길이를 알려주는 연산
//     }
// }
// ____________________________________________________________________________________________________________
// public class practice1{
//     public static void main(String[] args){
//         // Operator
//         System.out.println(6 + 2); // 8
//         System.out.println(6 - 2); // 4
//         System.out.println(6 * 2); // 12
//         System.out.println(6 / 2); // 3
//         System.out.println(6 % 2); // 0 나머지 연산

//         System.out.println(Math.PI);
//         System.out.println(Math.floor(Math.PI)); // 3.14 어쩌구 인데 floor는 내림이여서 3이된다.
//         System.out.println(Math.ceil(Math.PI)); // ceil을 올림
//     }
// }
// ____________________________________________________________________________________________________________
// public class practice1 {
//     public static void main(String[] args){
//         // Character VS String
//         System.out.println("Hello World"); //String 문자열
//         System.out.println('H'); // java에서는 ''는 특수한 Datatype을 나타낸다. Character 한 글자
//         System.out.println("H");

//         System.out.println("Hello "  // Hello World로 출력이된다.
//                     +"World");
//         // new line
//         System.out.println("Hello \nWorld"); // \n은 줄바꿈
//         // escape  \"World\"
//         System.out.println("Hello \"World\"");// Hello "World"   ""는 문자의 시작과 끝을알리는 것
//     }
// }
// ____________________________________________________________________________________________________________
// public class practice1{ // 문자열 처리
//     public static void main(String[] args){
//         System.out.println("Hello World".length()); // 11글자
//         System.out.println("Hello, [[[name]]] ... bye".replace("[[[name]]]","egoing")); // replace는 name을 뒤에있는 egoing으로 바꾼다.
//     }
// // }
// ____________________________________________________________________________________________________________
// public class practice1{
//     public static void main(String[] args){
//         int a = 1; // Number -> integer ... -2,-1,0,1 ...
//         System.out.println(a);

//         double b = 1.1;  // real number -> double ... -2.0, -1.0, 0.0
//         System.out.println(b);

//         String c = "Hello World"; // String
//         System.out.println(c);
//     }
// }
// ____________________________________________________________________________________________________________
// public class practice1{
//     public static void main(String[] args){
//         String name = "egoing";
//         System.out.println("Hello, "+name+" ... "+name+" ... egoing ...bye");
        
//         double VAT = 10.0;
//         System.out.println(VAT);
//     }
// }
// ____________________________________________________________________________________________________________
// public class practice1{  // Casting
//     public static void main(String[] args){
//         double a = 1.1;
//         double b = 1; // 1은 int이지만 자동으로 double로 coverting 된다.
//         double b2 = (double) 1; //수동으로 coverting 한 것
//         System.out.println(b);

//         //int c = 1.1;
//         double d = 1.1;
//         int e = (int) 1.1; // double형인데 강제로 int형으로 변환하겠다.
//         System.out.println(e);

//         // 1 to String
//         String f = Integer.toString(1);
//         System.out.println(f.getClass());

//     }
// }

