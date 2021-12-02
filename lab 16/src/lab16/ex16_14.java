package lab16;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class ex16_14 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        createMap(map);
        displayMap(map);

        System.out.println(map);
    }

    private static void createMap(Map<String, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < text.length(); i++) {
            String key = String.format("%s", text.charAt(i)).toUpperCase();

            if (key.equals(" "))
                continue;
            if (map.containsKey(key))
                map.put(key, map.get(key) + 1);
            else
                map.put(key, 1);
        }

    }

    private static void displayMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet();

        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%2s%10s%n", "Letra", "Vezes");

        for (String key : sortedKeys)
            System.out.printf("%2s %10s%n", key, map.get(key));
    }

}
