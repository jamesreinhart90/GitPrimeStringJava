package com.program.primestringjava;

/* Imports */
import java.util.Scanner;


public class PrimeStringJava {
    public static void main(String[] args) {
        /*String primeString = PrimeStringJava.PrimeString();*/
        Welcome();
        /*int input = PrimeStringJava.UserInput();
        int ID = PrimeStringJava.GetID(input, primeString);*/
        EndMessage(GetID(UserInput(), PrimeString()));
//        EndMessage(GetID(1, "2357111317"));
    }

    private static void Welcome() {
        System.out.println("Prime String Finder");
        System.out.println("Please enter a number between 1 and 1,000");
    }

    private static int UserInput() {
        Scanner scanner = new Scanner( System.in );
        int intInput = 0;
        int returnValue;
        String input = scanner.nextLine();

        try
        {
            intInput = Integer.parseInt(input);
        }
        catch (Exception e)
        {
            intInput = 0;
        }
        finally {
            if ((intInput > 1000) || (intInput < 1)) {
                System.out.println("Not a valid input, please enter a number between 1 and 1,000");
                intInput = 0;
            }
        }

        if (intInput == 0) {
            returnValue = UserInput();  // Recursion
        } else {
            returnValue = intInput;
        }
        return returnValue;
    }

    private static String PrimeString() {
        String primeString = "";
        int notPrime;

        for (Integer i = 2; i <= 1993; i++) {
            notPrime = 0;

            for (Integer j = 2; j < i; j++) {
                if (i % j == 0) {
                    notPrime++;
                }
            }

            if (notPrime == 0) {
                primeString += i;
            }
        }
        return primeString;
    }

    private static  Integer GetID(int input, String primeString){
        input --;
        Integer id;

        id = Integer.parseInt(primeString.substring(input,(input + 5)));
        return id;
    }

    private static void EndMessage(int id) {
        System.out.println("Your id is " + id);
    }

}
