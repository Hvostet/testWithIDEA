package test1;

import java.util.Arrays;

public class test6 {
    //  удалить повторы, отсортировать
    public static void main(String[] args) {

String str = "asdfasdfasdfxcv";
StringBuilder sb=new StringBuilder();

str.chars().distinct().sorted().forEachOrdered(el->sb.append((char)el));
        System.out.println(sb);



        String str2 ="asdvvvfhjkkk";
        StringBuilder sb2 = new StringBuilder();
        if(!str.isEmpty()) {
            char[] chars = str2.toCharArray();
            Arrays.sort(chars);
            sb2.append(chars[0]);
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] != chars[i - 1]) {
                    sb2.append(chars[i]);
                }
            }
        }
        System.out.println(sb2);
    }
}

