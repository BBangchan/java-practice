package ProjectOOP;

class Foo{
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";
    public static void classMethod(){ // 클레스메소드에서는 인스턴스는 접근 불가능.
        System.out.println(classVar);    // OK
        // System.out.println(instanceVar); // Error
    }
    public void instanceMethod(){  // 인스턴스메소드에서는 둘다 접근 가능.
        System.out.println(classVar);    // OK
        System.out.println(instanceVar); // OK
    }
}
/**
 * StaticApp
 */
public class StaticApp {

    public static void main(String[] args) {
        System.out.println(Foo.classVar); // OK
        // System.out.println(Foo.instanceVar); // Error
        Foo.classMethod();
        // Foo.instanceMethod();

        Foo f1 = new Foo();
        Foo f2 = new Foo();

        System.out.println(f1.classVar); // I class var
        System.out.println(f1.instanceVar); // I instance var

        f1.classVar = "changed by f1";
        System.out.println(Foo.classVar); // changed by f1
        System.out.println(f2.classVar); // changed by f1

        f1.instanceVar = "changed by f1";
        System.out.println(f1.instanceVar); // changed by f1
        System.out.println(f2.instanceVar); // I instance var
    }
}