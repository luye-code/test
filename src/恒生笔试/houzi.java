package 恒生笔试;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.5.1 14:16
 * @Version: 1.0
 */
public class houzi {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 0; i < 9; i++) {
            sum = (sum + 1) * 2;
        }
        System.out.println(sum);
        Object[] objects = new Object[]{new Object(), new Object(), new Object()};
        System.out.println(objects[0].hashCode() + " " + objects[1].hashCode());
        System.out.println(objects[0] + " " + objects[1]);
        String str1 = new String(new char[]{'d', 'e', 'f'});
        String str2 = str1.intern();
        System.out.println(str1==str2);
    }

}
