/*
Author: Aneta
Project: Car Dealership
Purpose Details: Contains the main menu for the car dealership where user can choose from a set of dealership options
Course: IST 242
Team: 4
Date Developed: 3/1/2020
Last Date Changed: 3/18/2020
Rev: 1
*/

package edu.psu.abington.ist.ist242;

import java.util.Scanner;

/**
 * <h1>Menu Class</h1>
 * <p>The Menu class holds the main menu dealership options for the dealership.</p>
 *
 * @author Aneta O'Donnell
 * @version 1.0
 * @since 3/18/2020
 */
public class Menu {
    boolean exit; // instance variable called exit that is set to false initially

    CustomerArray custArray;
    Car carArray;
    TransactionArray transactionArray;
    FiLoanOptionsArray fiLoanOptionsArray;

    /**
     * <h1>runMenu method</h1>
     * <p>The runMenu method is the method that gets called from the Main class
     * it contains all of the Menu class methods and is used to call all of the
     * methods in the Menu class.</p>
     *
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 3/18/2020
     */
    public void runMenu(){
        custArray = new CustomerArray();
        carArray = new Car();
        transactionArray = new TransactionArray();
        fiLoanOptionsArray = new FiLoanOptionsArray();
        printHeader(); //prints our header one time
        while(!exit){ // then until you choose the exit option
            printMenu(); //it prints the menu
            int choice = getInput(); //gets your input choice
            performAction(choice); // and then performs the action
        }
    }

    /**
     * <h1>printHeader method</h1>
     * <p>The printHeader method simply prints the
     * dealership header. It is called from the runMenu method.</p>
     *
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 3/18/2020
     */
    private void printHeader() { //just the printing out of the header
        System.out.println("---------------------------------------------------------");
        System.out.println("                   Car Dealership                        ");
        System.out.println("                        by:                              ");
        System.out.println("                  Aneta O'Donnell                        ");
        System.out.println("---------------------------------------------------------");
    }

    /**
     * <h1>printMenu method</h1>
     * <p>The printMenu method simply prints the
     * dealership options of pages to navigate to.
     * It is called from the runMenu method.</p>
     *
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 3/18/2020
     */
    private void printMenu(){ // prints out the menu
        System.out.println("\nMAIN MENU SELECTION:");
        System.out.println("1 - Direct to Customers page. ");
        System.out.println("2 - Direct to Inventory page.  ");
        System.out.println("3 - Direct to Sales page. ");
        System.out.println("4 - Direct to Finance page. ");
        System.out.println("0 - Quit the Program. ");
    }

    /**
     * <h1>getInput method</h1>
     * <p>The getInput method creates a menu input and asks the user
     * to enter their selection of which menu option page they would
     * like to navigate to. </p>
     *
     * @return choice of number for navigating to pages
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 3/18/2020
     */
    private int getInput() { // creates a menuinput from keyboard
        Scanner menuInput = new Scanner(System.in);
        int choice = -1; // sets the choice to negative 1
        while (choice < 0 || choice > 4) {// ---- change the 2 depending upon how many menu options we put in
            try {
                System.out.print("\nPlease enter your selection: ");
                choice = Integer.parseInt(menuInput.nextLine()); //tries to parse it
            } catch (NumberFormatException e) { // if it gets an error instead of crashing the program itll say below
                System.out.println("Invalid selection. Please try again.");
            }
        }
        return choice;
    }

    /**
     * <h1>performAction method</h1>
     * <p>The performAction method is called from the runMenu method in the Menu class.
     * It brings the user into the Dealership menu of options that are found in the
     * switch statement (0-Exit the Program, 1-Customer Page, 2-Car Page,
     * 3-Sales Page, 4-Finance Page).</p>
     *
     * @param choice this is the first parameter of performAction
     * @author  Aneta O'Donnell
     * @version 1.0
     * @since   3/18/2020
     */
    private void performAction(int choice){
        switch (choice){ // a switch statement is basically an if else statement
            case 0: // if the choice is equal to 0 then..
                exit = true;
                System.out.println("Thank you for coming into PSU Car Dealership. ");
                break;
            case 1: // if choice is equal to 1 then it will add a customer
                CustomerArray customerArray = new CustomerArray();
                customerArray.customerRecord(custArray);
                break;
            case 2:
                Vehicle car = new Vehicle();
                carArray.carRecord(carArray);
                break;
            case 3:
                Sales sales = new Sales();
                sales.salesRecords(custArray, transactionArray);
                break;
            case 4:
                Finance finance = new Finance();
                finance.financeRecords(fiLoanOptionsArray, custArray);
                break;
            //
            default:
                System.out.println("An unknown error has occurred. ");
                break;
        }
    }
}
