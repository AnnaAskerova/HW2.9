package homework210;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//домашка 2 задание 2
public class IntegerString {
    Map<Integer, String> map;

    public IntegerString() {
        map = new HashMap<>(10);
        for (int i = 0; i < 10; i++) {
            map.put(i, "Строка " + i);
        }
    }

    public void print() {
        Iterator<String> i = map.values().iterator();
        Iterator<Integer> j = map.keySet().iterator();
        while (i.hasNext()) {
            System.out.println(j.next().toString() + ':' + i.next());
        }
    }

    public static void main(String[] args) {
        var is = new IntegerString();
        is.print();
    }
}
