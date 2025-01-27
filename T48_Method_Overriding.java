class A{
    public void meth1(){
        System.out.println("Method 1 from class A");
    }
    public void meth2(){
        System.out.println("Method 2 from class A");
    }
}
class B extends A{
//    @Override
    public void meth2(){
        System.out.println("Method 1 from class b");
    }
    public void meth3(){
        System.out.println("Method 1 from class b");
    }
}
public class T48_Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.meth2();
//        a.meth2();
    }
}
