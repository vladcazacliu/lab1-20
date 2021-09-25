package lab5;
import java.util.Scanner; // include biblioteca scanerului pentru acceptarea introducerii de la tastatura

public class ex5_11 {//inceputul clasei
    public static void main(String[] args) {//// main method begins execution of Java application
        Scanner scanner = new Scanner(System.in);// create Scanner to obtain input from command window

        System.out.print("Enter number of values to input: ");
        int totalValues = scanner.nextInt(); //citim numere intregi pe care le introducem de la tastatura

        int smallest = 0;

        for (int i = 0; i < totalValues; i++) {
            System.out.print("Enter a integer: ");
            int number = scanner.nextInt();

            if (i == 0)
                smallest = number;

            if (number < smallest)
                smallest = number;
        }

        scanner.close();

        if (totalValues > 0)
            System.out.printf("%nSmallest is %d", smallest);
        else
            System.out.println("\nNo values were entered");
    }

}

