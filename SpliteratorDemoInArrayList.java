import java.util.*;

public class SpliteratorDemoInArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        Spliterator<Integer> sp1 = list.spliterator();
        Spliterator<Integer> sp2 = sp1.trySplit(); // Split into 2 parts

        System.out.println("Output from Spliterator 1:");
        sp1.forEachRemaining(n -> System.out.println("SP1: " + n));

        System.out.println("\nOutput from Spliterator 2:");
        sp2.forEachRemaining(n -> System.out.println("SP2: " + n));
    }
}
