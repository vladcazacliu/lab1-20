package lab2;

import java.util.Scanner;
public class ex2_25 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int number;

        //accept input from user
        System.out.println("Dati un numar:");
        number=input.nextInt();

        if(number(number)){
            System.out.println(number + " este par");

        }
        else{
            System.out.println(number + " este impar");
        }
    }
    public static boolean number(int num){
        if((num%2)==0) // dacă restul este 0 după împărțirea la 2, numărul este un număr par si se returneaza true
            return true;
        else
            return false;//daca restul nu egal cu 0 false este impar
    }
}


