package test2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Test2 {   //  найти первый уникальный (повторяющийся n hfp)

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 1, -1, -1, 3, 7, 7, -1, 0, 5, 4, 4, 4, 4);
        Map<Integer, Integer> link = new LinkedHashMap<>();

        for (Integer el : list) {
            link.put(el, link.getOrDefault(el, 0) + 1);
        }
        for (Integer el : link.keySet()) {
            if (link.get(el) == 1) {
                System.out.println(el);
                break;
            }
        }

    }
}
