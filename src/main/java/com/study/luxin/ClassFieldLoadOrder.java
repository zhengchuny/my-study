package com.study.luxin;

/**
 * Created by luxin on 2017/11/4. 测试类的加载顺序 输出的结果是下面的 constructor: a=1,b=1 a=1,b=10 首先,第一次
 * b=1,因为还未加载b,为b分配空间,b=0,然后b++,输出b=1.再次加载b并赋值,把原来的b的值覆盖b=10. a同理,静态变量一经赋值,后续的空间不会在改变.
 * 静态变量的加载顺序是按照声明的顺序
 */
public class ClassFieldLoadOrder {
    private static ClassFieldLoadOrder classFieldLoadOrder = new ClassFieldLoadOrder();
    private static int a;
    private static int b = 10;
    //private static ClassFieldLoadOrder classFieldLoadOrder = new ClassFieldLoadOrder();

    public ClassFieldLoadOrder() {
        a++;
        b++;
        System.out.println("constructor: " + "a=" + a + ",b=" + b);
    }

    public static void main(String[] args) {
        System.out.println("a=" + classFieldLoadOrder.a + ",b=" + classFieldLoadOrder.b);
    }

}
