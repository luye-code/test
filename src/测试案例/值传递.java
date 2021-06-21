package 测试案例;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.4.7 6:48
 * @Version: 1.0
 */
public class 值传递 {

    private static Class Person1;

    static {
        try {
            Person1 = Class.forName("测试案例.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws ClassNotFoundException {
//        System.out.println(Person1.getClassLoader());
        Person p = new Person();
        try {
            FileInputStream fileInputStream = new FileInputStream(String.valueOf(new InputStream() {
                @Override
                public int read() throws IOException {
                    return 0;
                }
            }));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(p.age);
        System.out.println(p.age);
        System.out.println(p.age);
        System.out.println(p.age);
        System.out.println(p.age);


        System.out.println("   ");
        System.out.println("   ");
        System.out.println("   ");
        System.out.println("   ");
        System.out.println("   ");
        change(p);
        System.out.println(p.age);


    }

    public static void change(Person person) {
        person.age = 66;
    }
}

class Person {
    int age;

    public void test() {
        System.out.println("I'm a Person");

    }
}
