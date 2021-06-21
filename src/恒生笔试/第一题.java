package 恒生笔试;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.5.1 13:33
 * @Version: 1.0
 */
public class 第一题 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        int k = 0;
        for (int i = 1; i <= 100; i++) {
            if (k == 5) {
                stringBuilder.delete(stringBuilder.length()-2,stringBuilder.length());
                System.out.println(stringBuilder);
                stringBuilder = new StringBuilder();
                k = 0;
            }
            if (String.valueOf(i).contains("9")) {
                continue;

            } else {
                stringBuilder.append(i + ", ");
                k++;
            }

        }
    }

}

