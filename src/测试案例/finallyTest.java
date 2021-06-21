package 测试案例;


/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.4.7 7:04
 * @Version: 1.0
 */
public class finallyTest {

    private static Dog test(Dog dog) {
        try {
            dog.age = 8;
            return dog;
        } finally {
            dog.age = 1;
            return dog;
        }

    }

    private static int test2(int val) {
        try {
            return val;
        } finally {
            val = 2;
        }
    }

    private static int test3(int val) {
        try {
            val = 4;
            return val;
        } finally {
            val = 3;
//            return val;
        }
    }

    private static int test4() {
        int i = 100;
        try {
            return i;
        } finally {
            i++;
        }
    }

    private static Dog test5(Dog dog) {
        try {
            return dog;
        } finally {

        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog = test(dog);
        System.out.println(dog.age);
        System.out.println(test2(4));
        System.out.println(test3(5));
        System.out.println(test4());
    }
}

class Dog {
    int age = 0;
}