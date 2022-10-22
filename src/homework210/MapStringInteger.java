package homework210;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
//домашка 1 задание 3
public class MapStringInteger {
    private final Map<String, Integer> pairs = new HashMap<>();

    public void addPair(String str, Integer number) {
        if (Objects.equals(pairs.put(str, number), number)) { //метод сам обновит содержимое по этому ключу, если оно есть
            throw new IllegalArgumentException("Значения совпадают");
        }
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : pairs.entrySet()) {
            sb.append(entry.getKey()).append(" ").append(entry.getValue()).append('\n');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        var msi = new MapStringInteger();
        msi.addPair("123", 1);
        msi.addPair("123", 2);
        msi.addPair("136", 9);
        msi.addPair("155", 9);
        //msi.addPair("155", 9);
        System.out.println(msi);
    }
}
