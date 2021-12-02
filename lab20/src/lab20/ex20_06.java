package lab20;

public class ex20_06 {
    public static void main(String[] args) {

        Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
        String[] stringArray = { "one", "two", "three", "four", "five", "six", "seven", "eight" };

        System.out.print("Array integerArray contains:%n");
        printArray(integerArray);
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray);
        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray);

        System.out.printf("%nArray stringArray contains:%n");
        printArray(stringArray);

    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 4 == 0 && i != 0)
                System.out.printf("%n%-8s", array[i]);
            else
                System.out.printf("%-8s", array[i]);
        }
    }

    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray)
            System.out.printf("%s ", element);

        System.out.println();
    }
}
