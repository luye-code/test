package 测试案例;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.4.7 6:15
 * @Version: 1.0
 */
public class 装箱拆箱测试 {
    public static void main(String[] args) {

        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        Long h = 2L;

        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));
        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));
        System.out.println(c.equals(a + h));
    }
}
