package Annotation;

class A {
    void show() {
        System.out.println("A in show");
    }
}
class B extends A {
    @Override
    void show() {
        System.out.println("B in show");
    }
}
public class Demo_1 {
     public static void main(String[] args) {
         A obj = new B();
         obj.show();
    }
}
