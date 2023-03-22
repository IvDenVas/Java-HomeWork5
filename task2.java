import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class task2 {
    public static void main(String[] args) {
        HashMap<String, String> staff = new HashMap<>();
        staff.put("Иванов", "Иван");
        staff.put("Петрова", "Светлана");
        staff.put("Белова", "Кристина");
        staff.put("Мусина", "Анна");
        staff.put("Крутова", "Анна");
        staff.put("Юрин", "Иван");
        staff.put("Лыков", "Петр");
        staff.put("Чернов", "Павел");
        staff.put("Чернышов", "Петр");
        staff.put("Федорова", "Мария");
        staff.put("Светлова", "Марина");
        staff.put("Савина", "Мария");
        staff.put("Рыкова", "Мария");
        staff.put("Лугова", "Марина");
        staff.put("Владимирова", "Анна");
        staff.put("Мечников", "Иван");
        staff.put("Петин", "Петр");
        staff.put("Ежов", "Иван");

        printHashMap(staff);
        // System.out.println((listMapName(staff)));
        sortHashMap(newHashMap(listMapName(staff)));
    }

    public static void printHashMap(HashMap<String, String> map) {
        for (var item : map.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
    }
    
    public static ArrayList<String> listMapName(HashMap<String, String> hashmap) {
        ArrayList<String> lstName = new ArrayList<>();
        for (var item : hashmap.entrySet()) {
            lstName.add(item.getValue());
        }
        return lstName;
    }

    public static HashMap<String, Integer> newHashMap(ArrayList<String> lst) {
        HashMap<String, Integer> temp = new HashMap<>();
        for (String string : lst) {
            if (temp.containsKey(string) == false) {
                temp.put(string, Collections.frequency(lst, string));
            }
        }
        return temp;
    }

    public static void sortHashMap(HashMap<String, Integer> map) {
        ArrayList<Integer> lst = new ArrayList<>();

        for (var item : map.entrySet()) {
            if (!lst.contains(item.getValue())) {
                lst.add(item.getValue());
            }
        }
        lst.sort(null);

        for (int i = lst.size() - 1; i >= 0; i--) {
            for (var item : map.entrySet()) {
                if (lst.get(i) == item.getValue()) {
                    System.out.println(item.getKey() + "- количество повторений: " + item.getValue());
                }
            }
        }
    }
}
