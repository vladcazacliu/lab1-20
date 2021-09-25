package lab2;

import java.util.Scanner;
public class ex2_16 {
    // main method begins execution of Java application
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);//cream scaner pentru a obtine input

// initialize variables
        int num1;
        int num2;

        System.out.print("Dati primul nr: ");//promt
        num1 = input.nextInt(); //citim numere intregi pe care le introducem de la tastatura lucreaza impreuna cu scanner input

        System.out.print("Dati al doilea nr: ");
        num2 = input.nextInt();

        if (num1 > num2)
            System.out.printf("%d este mai mare decat %d\n",num1,num2);

        if (num1 < num2)
            System.out.printf("%d este mai mare decat %d\n", num2, num1);

        if (num1 == num2)
            System.out.println("Aceste numere sunt egale");

    }// end method main
} // end class


