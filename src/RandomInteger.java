import java.util.LinkedList;
import java.util.List;


public class RandomInteger {
    public static void main(String[] args) {
        var integers = getNumbers(20);
        integers.removeIf(integer -> integer % 2 != 0);
        System.out.println(integers);
    }

    static List<Integer> getNumbers(int a) {
        List<Integer> integers = new LinkedList<>();
        for (int i = 0; i < a; i++) {
            integers.add((int) (Math.random() * 1001));
        }
        return integers;
    }
}
