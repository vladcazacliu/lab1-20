package lab2;

import java.util.Scanner; // include biblioteca scanerului pentru acceptarea introducerii de la tastatura

public class ex2_15 { // begin class
    // main method begins execution of Java application
    public static void main(String[] args) // begin the main method

    {
        Scanner input=new Scanner(System.in); // create Scanner to obtain input from command window


        int num1;
        int num2;
        int sum;
        int product;   // initialize variables
        int difference;
        int quotient;

        System.out.print("Dati 1 numar: ");
        num1 = input.nextInt();//citim numere intregi pe care le introducem de la tastatura

        System.out.print("Dati al 2 numar: ");
        num2 = input.nextInt();

        sum    = num1 + num2;
        product    = num1 * num2;
        difference = num1 - num2;
        quotient = num1 / num2;
        // afișează suma, produsul, diferența și coeficientul celor două numere
        System.out.printf("Sum is %d\n", +sum);
        System.out.printf("Product is %d\n", +product);
        System.out.printf("Difference is %d\n", +difference);
        System.out.printf("Quotient is %d\n", +quotient);

    }
}

