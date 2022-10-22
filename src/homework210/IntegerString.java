package homework210;

import java.util.LinkedHashMap;
import java.util.Map;

//домашка 2 задание 2
public class IntegerString {
    Map<Integer, String> map;

    public IntegerString() {
        map = new LinkedHashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, "Строка " + i);
        }
    }

    public void print() {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey().toString() + ':' + entry.getValue());
        }
    }

    public static void main(String[] args) {
        var is = new IntegerString();
        is.print();
    }
}
