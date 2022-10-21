package homework210;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//домашка 2 задание 1
public class MapStringList {
    private final Map<String, List<Integer>> listMap = new HashMap<>(5);

    public MapStringList() {
        for (int i = 0; i < 5; i++) {
            listMap.put("Строка " + i, List.of((int) (Math.random() * 1001), (int) (Math.random() * 1001),
                    (int) (Math.random() * 1001)));
        }
    }

    public Map<String, List<Integer>> getListMap() {
        return listMap;
    }

    public static void printMap(Map map) {
        for (Object o : map.entrySet()) {
            System.out.println(o);
        }
    }

    public Map<String, Integer> getTransformMap() {
        var temp = new HashMap<String, Integer>();
        for (Map.Entry<String, List<Integer>> entry : listMap.entrySet()) {
            temp.put(entry.getKey(), entry.getValue().get(0) + entry.getValue().get(1) + entry.getValue().get(2));
        }
        return temp;
    }

    public static void main(String[] args) {
        var msl = new MapStringList();
        printMap(msl.getListMap());
        msl.getTransformMap();
        printMap(msl.getTransformMap());
    }
}
