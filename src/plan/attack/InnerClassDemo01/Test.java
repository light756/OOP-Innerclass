package plan.attack.InnerClassDemo01;

public class Test {
    public static void main(String[] args) {
        Outer.Inner in=new Outer().new Inner();
        in.show();
        in.print();
        Outer out=new Outer();
        out.show();
        out.method();
    }
}
