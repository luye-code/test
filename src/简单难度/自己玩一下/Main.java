package 简单难度.自己玩一下;// 本题为考试单行多行输入输出规范示例，无需提交，不计分。

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer i1 = 64;
        int i2 = 64;
        Integer i3 = Integer.valueOf(64);
        Integer i4 = new Integer(64);
        Integer i5 = 256;
        Integer i6 = Integer.valueOf(256);
        System.out.println("A：" + (i1 == i2));
        System.out.println("B：" + (i1 == i3));
        System.out.println("C：" + (i3 == i4));
        System.out.println("D：" + (i2 == i4));
        System.out.println("E：" + (i3.equals(i4)));
        System.out.println("F：" + (i5 == i6));

        String s1 = new String("he") + new String("llo");
        String s2 = new String("h") + new String("ello");

        String s3 = s1.intern();
        String s4 = s2.intern();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String ab = in.next();
            char[] chars = ab.toCharArray();
            List<Character> characterList = new LinkedList<>();
            HashSet<Character> characterHashSet1 = new HashSet<>();
            characterHashSet1.add('(');
            characterHashSet1.add('[');
            characterHashSet1.add('{');
            HashSet<Character> characterHashSet2 = new HashSet<>();
            characterHashSet2.add('}');
            characterHashSet2.add(')');
            characterHashSet2.add(']');
            for (int i = 0; i < chars.length ; i++) {
                if (characterHashSet1.contains(Character.valueOf(chars[i]))) {
                    characterList.add(chars[i]);
                }
                else {
                    if (')'==chars[i] && characterList.get(characterList.size()-1).equals('('))
                    {
                        characterList.remove(characterList.size()-1);
                    }else if ('}'==chars[i] && characterList.get(characterList.size()-1).equals('{'))
                    {
                        characterList.remove(characterList.size()-1);

                    }
                    else if (']'==chars[i] && characterList.get(characterList.size()-1).equals('['))
                    {
                        characterList.remove(characterList.size()-1);
                    }
                    else{

                        System.out.println(false);
                        return;
                    }

                }
            }
            System.out.println(true);
        }
    }
}