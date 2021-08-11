package ProjectMethod;
class Greeting{
    //public, protected, default, private
    public static void hi(){
        System.out.println("Hi");
    }
}

public class AccessLevelModifiersMethod{
    // private으로 선언을하면 같은 class안에서만 사용이 가능하다
    // public으로 선언하면 다른 class에 있어도 사용이 가능하다. 
    public static void main(String[] args) {
        Greeting.hi();
    }
}