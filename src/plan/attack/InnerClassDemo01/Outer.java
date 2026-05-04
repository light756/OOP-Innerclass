package plan.attack.InnerClassDemo01;

public class Outer {
    //测试内部类-外部类
    //测试内部私有类
    //测试this关键字
    String flag="标识——外部类标志";
    public void show(){
        System.out.println("外部类方法");
    }
    public class Inner{
        String flag="标识——内部类标志";
        public void show(){
            System.out.println("内部类方法");
        }
        public void print(){
            System.out.println(flag);
            System.out.println(this.flag);
            System.out.println(Outer.this.flag);
        }
    }
    private class InnerPrivate{
        public void show(){
            System.out.println("内部私有类方法");
        }
    }
    public void method(){
        InnerPrivate innerPrivate=new InnerPrivate();
        innerPrivate.show();
    }
}
