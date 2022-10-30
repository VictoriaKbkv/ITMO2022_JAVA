package Task9;

import java.text.DecimalFormat;
import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###,###");

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        long startTime = System.nanoTime();
        fillArrayList(list1);
        long endTime = System.nanoTime();
        System.out.println("Fill ArrayList: " + df.format((endTime-startTime))); //37 704 300

        startTime = System.nanoTime();
        fillArrayList(list2);
        endTime = System.nanoTime();
        System.out.println("Fill LinkedList: " + df.format((endTime-startTime))); //200 425 500

        startTime = System.nanoTime();
        chooseFromArrayList(list1);
        endTime = System.nanoTime();
        System.out.println("Choose from ArrayList: " + df.format((endTime-startTime))); //28 218 600

        startTime = System.nanoTime();
        chooseFromLinkedList(list2);
        endTime = System.nanoTime();
        System.out.println("Choose from LinkedList: " + df.format((endTime-startTime))); //173 995 562 900
    }

    public static List<Integer> fillArrayList(List<Integer> list) {
        list.clear();
        Random random = new Random();
        for (int i=0; i< 800_000; i++) { // для 1 млн Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
            list.add(random.nextInt());
        }
        return list;
    }

    public static List<Integer> fillLinkedList(List<Integer> list) {
        list.clear();
        Random random = new Random();
        for (int i=0; i< 800_000; i++) { // для 1 млн Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
            list.add(random.nextInt());
        }
        return list;
    }

    public static List<Integer> chooseFromArrayList(List<Integer> list) {
        Random random = new Random();
        List<Integer> result = new ArrayList<>();
        for (int i=0; i< 100_000; i++) {
            int j = random.nextInt(list.size());
            result.add(list.get(j));
        }
        return list;
    }

    public static List<Integer> chooseFromLinkedList(List<Integer> list) {
        Random random = new Random();
        List<Integer> result = new ArrayList<>();
        for (int i=0; i< 100_000; i++) {
            int j = random.nextInt(list.size());
            result.add(list.get(j));
        }
        return list;
    }
}
