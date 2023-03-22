import java.util.ArrayList;
import java.util.HashMap;

public class task1 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
        add("Иванов", 555555, phoneBook);
        add("Петров", 555566, phoneBook);
        add("Иванов", 555577, phoneBook);
        add("Сидоров", 556622, phoneBook);
        add("Сергеев", 456568, phoneBook);
        add("Кукуев", 456123, phoneBook);

        showPhoneBook(phoneBook);

        searchNumber("Иванов", phoneBook);
        remove("Иванов", phoneBook);
    }

    public static void add(String key, int value, HashMap<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(value);
            map.putIfAbsent(key, temp);
        }
    }

    public static void searchNumber(String key, HashMap<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            System.out.println("\nПоиск по фамилии = " + key + ":" + map.get(key));
        } else {
            System.out.println("\nПоиск по фамилии = " + key + ": Такого контакта нет!");
        }
    }

    public static void remove(String key, HashMap<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.remove(key);
            System.out.println("\nПосле удаления " + key +   ":");
            showPhoneBook(map);

        } else
            System.out.println("\nТакого контакта нет!");
    }

    public static void showPhoneBook(HashMap<String, ArrayList<Integer>> map) {
        if (map.isEmpty())
            System.out.println("\nКнига пуста!\n");
        else {
            for (var item : map.entrySet()) {
                System.out.printf(item.getKey() + item.getValue() + "\n");

            }
        }
    }
}