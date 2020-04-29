/*
Project: Car Dealership
Purpose Details: Contains the exceptions for alpha characters, email format, phone number format, SSN format
Course: IST 242
Team: 4
Date Developed: 4/19/2020
Last Date Changed: 4/19/2020
Rev: 1
*/

package edu.psu.abington.ist.ist242;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <h1> Exception </h1>
 * <p> The Exception class handles exception with try and
 * catch blocks for all the other classes.</p>
 *
 * @author Aneta O'Donnell
 * @revision 1.0
 * @since 4/19/2020
 *
 */
public class Exception extends Throwable {

    /**
     * <h1>getInput method</h1>
     * <p>This method prompts user for an input and is used inside the addCustomer
     * method to ask for customer information and then through setters
     * add that information into the customer array list.</p>
     *
     * @return input
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 4/19/2020
     */
    public static String getInput() {
        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine();
        return input;
    }

    /**
     * <h1>testAlpha method</h1>
     * <p>This method tests if input contains alpha characters
     * and consists of a try and catch block to make sure user input
     * contains only alpha characters.</p>
     *
     * @param alphaCharacter user input
     * @return a String of alpha characters
     * @throws InputMismatchException if string tested does not contain alpha characters
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 4/19/2020
     *
     */
    public static String testAlpha(String alphaCharacter) {
        try {
            if (alphaCharacter.matches("^[-'A-Za-z.\\s_-]+$")) {
                return alphaCharacter;
            } else {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException notAnAlpha) {
            System.out.println("Invalid input. Please make sure you did not enter integers. Please try again.");
            return testAlpha(getInput());
        }
    }

    /**
     * <h1>testAlphaNumeric method</h1>
     * <p>This method tests if input matches alphanumeric characters
     * and consists of a try and catch block to assure user input
     * contains alphanumeric characters only.</p>
     *
     * @param input user input
     * @return alphanumeric string
     * @throws InputMismatchException if input tested is not alphanumeric
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 4/19/2020
     *
     */
    public static String testAlphaNumeric(String input) {
        while (true) {
            try {
                if (input.matches("^[a-zA-Z0-9]*$")) {
                    return input;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException notAnInt) {
                System.out.println("Invalid input. You did not enter alphanumeric characters. Please try again.");
                return testAlphaNumeric(getInput());
            }
        }
    }

    /**
     * <h1>testPhone method</h1>
     * <p>This method tests if input matches a phone number format
     * and consists of a try and catch block to make sure user input
     * follows a standard phone number format.</p>
     *
     * @param phone user input
     * @return a phone number
     * @throws InputMismatchException if input tested does not match phone number format
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 4/19/2020
     */
    public static String testPhone(String phone) {
        while (true) {
            try {
                if (phone.matches("^[(]+[0-9]+[)]+[\\s]+[0-9]+[-]+[0-9]+$")) {
                    return phone;
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException notAnEmail) {
                System.out.println("Invalid input. Please try again.\nPlease use this format: (012) 345-6789");
                return testPhone(getInput());
            }
        }
    }

    /**
     * <h1>testSSN method</h1>
     * <p>This method tests if input matches a Social Security Number format
     * and consists of a try and catch block to make sure user input
     * follows a standard social security number format.</p>
     *
     * @param SSN user input
     * @return a Social Security number
     * @throws InputMismatchException if input tested does not match Social Security Number format
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 4/19/2020
     */
    public static String testSSN(String SSN) {
        while (true) {
            try {
                if (SSN.matches("^[0-9]+[-]+[0-9]+[-]+[0-9]+$")) {
                    return SSN;
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException notAnEmail) {
                System.out.println("Invalid input. Please try again.\nPlease use this format: 012-34-5678");
                return testSSN(getInput());
            }
        }
    }

    /**
     * <h1>testDouble method</h1>
     * <p>This method tests if input is a double and consists
     * of a try and catch block to assure user input for setting
     * a price is a double.</p>
     *
     * @param price user input
     * @return a price
     * @throws InputMismatchException if input tested is not a double
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 4/19/2020
     *
     */
    public static String testDouble(String price) {
        try {
            if (price.matches("\\d+\\.\\d*$")) {
                return price;
            }
            else  {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException notAnAlpha) {
            System.out.println("Invalid input. Input a double. Please try again.");
            return testDouble(getInput());

        }
    }
}
