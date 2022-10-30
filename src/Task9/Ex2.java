package Task9;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(101);
        list1.add(100);
        list1.add(101);
        list1.add(200);
        list1.add(101);
        list1.add(200);

        List<String> list2 = new ArrayList<>();
        list2.add("100");
        list2.add("101");
        list2.add("100");
        list2.add("101");
        list2.add("ABC");
        list2.add("abc");
        list2.add("ABC");

        System.out.println(removeDuplicates(list1));
        System.out.println(removeDuplicates(list2));

    }

    public static  <T> Set<T> removeDuplicates (List<T> list) {
        Set<T> result = new LinkedHashSet<>(list);
        return result;
    }
}
