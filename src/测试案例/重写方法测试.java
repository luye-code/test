package 测试案例;

import java.util.List;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.4.2 9:34
 * @Version: 1.0
 *
 * 父类子类转换，有调用被子类overwrite的方法，一律使用overwrite方法
 * 成员变量用自身的，父类不可用子类的成员变量，成员方法，子类可以用父类的
 */
public class 重写方法测试 {
    public static void main(String[] args) {
//        Hero hero = new SuperMan();
//        System.out.println(hero.name());


        SuperMan superMan = new SuperSuperMan();
        System.out.println(superMan.hero().name()+" "+superMan.num+" " +superMan.sayHi()+" "+superMan.s);

        superMan.s="456";
        SuperSuperMan superSuperMan = (SuperSuperMan) superMan;
        System.out.println(superSuperMan.name()+" "+superSuperMan.aaa+" " +" "+superSuperMan.sayHi()+" "+superSuperMan.sayHi6());
        System.out.println(superSuperMan.num+superSuperMan.s);

    }
}

class Hero {
    public String name() {
        return "超级英雄";
    }
}

class SuperMan extends Hero {
    int num = 4;
    int aaa=1;
    String s = new String("louis");

    @Override
    public String name() {
        return "超⼈";
    }

    public Hero hero() {
        return new Hero();
    }

    public int sayHi()
    {
        return 6;
    }
}

class SuperSuperMan extends SuperMan {
    int num = 5;
    int num2 = 3;
//    String s = new String("xwj");


    @Override
    public String name() {
        return "超级超级英雄";
    }

    @Override
    public Hero hero() {
        return new SuperSuperMan();
    }

    @Override
    public int sayHi()
    {
        return 5;
    }

    public int sayHi2()
    {
        return 2;
    }

    public int sayHi6()
    {
        return 66;
    }
}