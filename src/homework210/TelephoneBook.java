package homework210;

import java.util.HashMap;
import java.util.Map;
//домашка 1 задание 1
public class TelephoneBook {
    private final Map<String, String> telephoneBook = new HashMap<>();

    public void addNote(String name, String number) {
        number = number.replaceAll("[\\ \\-]", "");
        if (!number.startsWith("+")) {
            if (number.startsWith("8")) {
                number = "+7" + number.substring(1);
            } else {
                number = "+7" + number;
            }

        }
        telephoneBook.put(name, number);
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        for (Map.Entry<String, String> entry : telephoneBook.entrySet()) {
            sb.append(entry.getKey()).append(" ").append(entry.getValue()).append('\n');
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        var book = new TelephoneBook();
        book.addNote("Валера Петров", "8-916-3152225");
        book.addNote("Саша Иванов", "8-969-3154525");
        book.addNote("Ксюша Арбузова", "+7969-315 45 25");
        book.addNote("Света Винниченко", "8-969-3157775");
        book.addNote("Лена Фонина", "8-969-315 44 25");
        book.addNote("Анна Липова", "8-969-3154525");
        book.addNote("Коля Бунин", "+7 -969-3154525");
        book.addNote("Ваня Иванов", "8-999-6664525");
        book.addNote("Алла Михайловна", "8-922-5554525");
        book.addNote("Игорь Ленин", "8-913-4444525");
        book.addNote("Иван Петров", "8-955-2254525");
        book.addNote("Сергей Сергеев", "8-919-9994525");
        book.addNote("Сергей Ищенко", "919-3004525");
        book.addNote("Влада Белова", "8-999-312- 25-25");
        book.addNote("Ирина Колесникова", "8-913-3152055");
        book.addNote("Ира Кива", "8-919-200 45 25");
        book.addNote("Гена Кива", "8-982-115- 4525");
        book.addNote("Ирка Краснова", "969-215-88-25");
        book.addNote("Саша Рыбаков", "999-3936521");
        book.addNote("Елена Зимина", "969-3333333");
        System.out.println(book);
    }
}
