import java.util.HashSet;
import java.util.Set;


public class RandomInteger {
    public static void main(String[] args) {
        var integers = getNumbers(20);
        integers.removeIf(integer -> integer % 2 != 0);
        System.out.println(integers);
    }

    static Set<Integer> getNumbers(int a) {
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < a; i++) {
            integers.add((int) (Math.random() * 1001));
        }
        return integers;
    }
}
