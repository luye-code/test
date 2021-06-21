package 简单难度.递归;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.4.8 14:52
 * @Version: 1.0
 */
public class Solution {
    public int degree(int val) {
        if (val == 1) {
            return 1;
        }
        return val * degree(val - 1);
    }

    /**
     * 如何保证变量s指向的是字符串常量池中的数据呢？
     * 有两种方式：
     * 方式一： String s = "shkstart";//字面量定义的方式
     * 方式二： 调用intern()
     * String s = new String("shkstart").intern();
     * String s = new StringBuilder("shkstart").toString().intern();
     */
    public static void main(String[] args) {

        String s = new String("1");
        s.intern();//调用此方法之前，字符串常量池中已经存在了"1"
        String s2 = "1";
        System.out.println(s == s2);//jdk6：false   jdk7/8：false


        String s3 = new String("1") + new String("1");//s3变量记录的地址为：new String("11")
        //执行完上一行代码以后，字符串常量池中，是否存在"11"呢？答案：不存在！！
//        s3.intern();
        System.out.println("12" == s3.intern());
        //如何理解：jdk6:创建了一个新的对象"11",也就有新的地址。
        //jdk7:此时常量中并没有创建"11",而是创建一个指向堆空间中new String("11")的地址
        String s4 = "11";//s4变量记录的地址：使用的是上一行代码代码执行时，在常量池中生成的"11"的地址
        System.out.println(s3 == s4);//jdk6：false  jdk7/8：true
//        System.out.println(s4 == s6);


        String x = new String(new char[]{'a', 'b', 'c'});
        String z = x.intern(); //  x 加入 StringTable，StringTable 中有了 "abc"
        String y = "abc"; // 已有，不会产生新的对象，用的是 StringTable 中 "abc"
        System.out.println(z == x);//true
        System.out.println(z == y);//true  x y z 都是指向堆对象的指针


    }


}
