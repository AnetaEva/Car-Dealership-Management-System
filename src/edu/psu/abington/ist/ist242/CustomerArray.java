/*
Author: Aneta
Project: Car Dealership
Purpose Details: Contains the customer array object for information related to the customers.
Course: IST 242
Team: 4
Date Developed: 4/17/2020
Last Date Changed: 4/18/2020
Rev: 1
*/

package edu.psu.abington.ist.ist242;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <h1>CustomerArray Class</h1>
 * <p>The CustomerArray class contains an array list
 * of a few different customers with their respective descriptions.</p>
 *
 * @author Aneta O'Donnell
 * @version 1.0
 * @since 4/18/2020
 */
public final class CustomerArray extends Customers {

    ArrayList<Customers> cList;



    /**
     * Counter to automatically generate customer IDs
     * @author Aneta O'Donnell
     */
    int cCount = 101;

    /**
     * CustomerArray Constructor
     */
    public CustomerArray(){

        cList = new ArrayList<Customers>();

        Customers cust2 = new Customers();
        Customers cust3 = new Customers();
        Customers cust4 = new Customers();
        Customers cust5 = new Customers();

        cust2.setCustID(cCount++);
        cust2.setFullName("Mary Meyers");
        cust2.setAddress("42 Almond Avenue, Blue Bell, PA 19422");
        cust2.setCustPhoneNumber("(484) 542-4587");
        cust2.setCustLicense("12645335");
        cust2.setSSN("154-85-9654");

        cust3.setCustID(cCount++);
        cust3.setFullName("Elizabeth French");
        cust3.setAddress("145 Plymouth Road, Plymouth Meeting, PA 19462");
        cust3.setCustPhoneNumber("(610) 462-5487");
        cust3.setCustLicense("24156448");
        cust3.setSSN("154-56-4856");

        cust4.setCustID(cCount++);
        cust4.setFullName("Barry White");
        cust4.setAddress("1844 Rolling Hills Road, Willow Grove, PA 19090");
        cust4.setCustPhoneNumber("(610) 475-5521");
        cust4.setCustLicense("45154662");
        cust4.setSSN("202-52-8554");

        cust5.setCustID(cCount++);
        cust5.setFullName("Carole Baskin");
        cust5.setAddress("542 Tiger Lane, Warrington, PA 18976");
        cust5.setCustPhoneNumber("(215) 854-8856");
        cust5.setCustLicense("45854335");
        cust5.setSSN("142-85-6653");

        cList.add(cust2);
        cList.add(cust3);
        cList.add(cust4);
        cList.add(cust5);

    }

    /**
     * <h1>Getter for Customer Array list</h1>
     * @return ArrayList cList which contains contents that are in the Customers Array.
     */
    public ArrayList<Customers> getCustomerArray(){
        return cList;
    }

    /**
     * <h1>Getter for cCount</h1>
     *
     * @return cCount which gets the next Count of ID for Customers
     */
    public int cCount(){
        return cCount;
    }

    public int getcCount() {
        return cCount;
    }

    public void setcCount(int cCount) {
        this.cCount = cCount;
    }


    /**
     * <h1>Customer Record</h1>
     * <p>The customerRecord method is called from the Menu Class
     * if you select option 1 from the Menu. It brings the user
     * into the Customer's menu of options that are found in the
     * do statement.
     * The customerRecord method contains a switch statement based
     * off of the menu of options (Add Customer, Update Current Customer,
     * Display Customer Profile, Print List of Customers and Exit.</p>
     *
     * @param customerArray this is the first parameter of customerRecord
     * @author  Aneta O'Donnell
     * @version 1.0
     * @since   4/21/2020
     */
    protected void customerRecord(CustomerArray customerArray) {
        Customers cust1 = new Customers();
        ArrayList cList = customerArray.getCustomerArray();
        int choice = 0;
        boolean flag = true;
        custID = cCount;

        do {
            System.out.println("\nCUSTOMERS MENU:\n1 - Add Customer \n2 - Print List of Customers \n3 - Exit");
            System.out.println("Enter your choice:");
            choice = -1;
            Scanner scnr = new Scanner(System.in);

            if (scnr.hasNextInt()) {
                choice = scnr.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("-- ADD A NEW CUSTOMER -- ");
                        addCustomer(cList);
                        break;
                    case 2:
                        System.out.println("-- DEALERSHIP CUSTOMERS --");
                        printCustomer(cList);
                        break;
                    case 3:
                        System.out.println("Return back to main menu");
                        flag = false;
                        //return back()
                        break;
                    default:
                        System.out.println("Try again.");
                        break;
                }
            }
        }
        while (choice != 3);
    }

    /**
     * <h1>addCustomer method</h1>
     * <p>adds a new car dealership customer</p>
     *
     * @param cList this is the first parameter of addCustomer
     * @return a Customer
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 4/28/2020
     */
    public Customers addCustomer(ArrayList<Customers> cList) {
        Customers cust1 = new Customers();
        Scanner scnr = new Scanner(System.in);
        custID = cCount;

        cust1.setCustID(cCount); //TODO: getcCount

        System.out.println("Please enter customer full name: ");
        fullName = (Exception.testAlpha(Exception.getInput()));
        cust1.setFullName(fullName);

        System.out.println("Please enter customer address: ");
        cust1.setAddress(scnr.nextLine());

        System.out.println("Please enter customer phone number, please use this format (012) 345-6789: ");
        custPhoneNumber = (Exception.testPhone(Exception.getInput()));
        cust1.setCustPhoneNumber(custPhoneNumber);

        System.out.println("Please enter customer license: ");
        custLicense = (Exception.testAlphaNumeric(Exception.getInput()));
        cust1.setCustLicense(custLicense);

        System.out.println("Please enter customer SSN, please use this format 123-45-6789: ");
        SSN = (Exception.testSSN(Exception.getInput()));
        cust1.setSSN(SSN);

        cList.add(cust1);

        System.out.println(cust1);

        System.out.println("\n * Customer Record is saved in the system. * \n");

        return cust1;

    }


    /**
     * <h1>Print Customers</h1>
     * <p>The printCustomer method is used to print or display
     * all Customers that are in the system.</p>
     *
     * @param cList this is the first parameter of printCustomer
     * @author  Aneta O'Donnell
     * @version 1.0
     * @since   4/21/2020
     */
    public Boolean printCustomer(ArrayList<Customers> cList) {
        for (Customers clients : cList) {
            System.out.println(clients);
        }
        return true;
    }


    /**
     * <h1>financeApplication method</h1>
     * <p>The financeApplication method is called from the Finance class.
     * This method uses the Customer Array List to search by SSN.
     * This method asks for user to enter the SSN that is applying for
     * financing and and prints that the customer has either applied or
     * that the SSN was not found in the Customer Array List. </p>
     *
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 4/25/2020
     */
    public Boolean financeApplication() { //TODO: should I create a new ArrayList class for ApplicationArray
        System.out.println("Enter SSN to apply:");
        Scanner input = new Scanner(System.in);
        String SSN = input.nextLine();

        for (int i=0; i<cList.size(); i++) {
            if (cList.get(i).SSN.equals(SSN)) {
                cList.get(i); //do something
                System.out.println("Customer with SSN: " + SSN + " applied!");
                break;
            }
            else{
                System.out.println("Sorry customer with SSN: " + SSN + " was not found!");
                break;
            }
        }
        return true;
    }

    /**
     * <h1>approvalDenial method</h1>
     * <p>The approvalDenial method is called from the Finance class.
     * This method is based on the financeApplication method for the customer
     * that applies for a finance application. This method asks for user to
     * enter the SSN that applied for the financing application and prints whether
     * the customer that applied has been approved for financing. </p>
     *
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 4/25/2020
     */
    public void approvalDenial() { //TODO: should I create a new ArrayList class for ApplicationArray
        System.out.println("Enter SSN of customer: ");
        Scanner input = new Scanner(System.in);
        String SSN = input.nextLine();

        for (int i = 0; i < cList.size(); i++) {
            if (cList.get(i).SSN.equals(SSN)) {
                cList.get(i); //do something
                System.out.println("Customer with SSN: " + SSN + " has been approved!");
                break;
            } else {
                System.out.println("Sorry customer with SSN: " + SSN + " was not found!");
                break;
            }
        }
    }
}
