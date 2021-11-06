package lab16;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
public class ex16_17 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        List<Integer> linkedList = new LinkedList<Integer>();

        for (int i = 0; i < 25; i++)
            linkedList.add(random.nextInt(101));

        linkedList.sort(null);

        double average = 0;
        for (int number : linkedList)
            average += number;

        System.out.println(linkedList);
        System.out.printf("Sum: %,.0f%nMedia: %,.2f", average, average / linkedList.size());
    }
}
