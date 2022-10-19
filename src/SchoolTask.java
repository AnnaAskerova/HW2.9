import java.util.HashSet;
import java.util.Set;

public class SchoolTask {
    private final Set<String> tasks = new HashSet<>(15);

    public SchoolTask() {
        while (tasks.size() < 16) {
            var s = String.format("%d * %d", (int) (Math.random() * 8 + 2),
                    (int) (Math.random() * 8 + 2));
            if (tasks.contains(new StringBuilder(s).reverse().toString())) {
                continue;
            } else {
                tasks.add(s);
            }
        }
    }

    public void printTasks() {
        for (String task : tasks) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        var st = new SchoolTask();
        st.printTasks();
    }
}
