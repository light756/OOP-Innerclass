package plan.attack.InnerClassDemo02;

public class Test {
    //测试匿名内部类
    public static void main(String[] args) {
        fight(new Inter(){
            public void attack(){
                System.out.println("匿名内部类");
            }
        });
        //创建对象的方法利用匿名内部类
        Inter i=new Inter(){
            public void attack(){
                System.out.println("匿名内部类——声明与创建对象式");
            }
        };
        i.attack();
    }
    public static void fight(Inter i){
        i.attack();
    }
}
