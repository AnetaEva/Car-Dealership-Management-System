/*
Author: Aneta/Houssam Mouakkil
Project: Car Dealership
Purpose Details: Finance  object that contains information about financing and running finance reports
Course: IST 242
Team: 4
Date Developed: 3/28/2020
Last Date Changed: 3/28/2020
Rev:
 */

package edu.psu.abington.ist.ist242;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <h1>Finance Class</h1>
 * <p>The Finance class holds the data members and methods that will
 * allow customers to apply for financing, check on the status of their
 * finance application, view finance loan options. </p>
 *
 * @author Aneta O'Donnell
 * @version 1.0
 * @since 3/28/2020
 */
public class Finance extends Customers {

    ArrayList<Customers> cList = new ArrayList<Customers>();

    /**
     * Counter to automatically generate customer IDs
     * @author Aneta O'Donnell
     */
    int cCount = 101;

    /**
     * Unique identification number of each Financing Option
     * @author Aneta O'Donnell
     */
    private int financeID;

    /**
     * Bank Name
     */
    private String bankName;
    /**
     * The APR the bank is offering
     */
    private String APR;
    /**
     * The Term the loan is for
     */
    private String term;

    /**
     * Revenue
     * @author Houssam
     */
    private String Revenue;
    int Revenue1 = 50000;
    int Revenue2 = 45000;
    int Revenue3 = 25000;


    /**
     * Getter of the Finance Options ID
     * @return the ID of financing options
     */
    public int getFinanceID() {
        return financeID;
    }

    /**
     * Setter of the Finance Options ID
     * @param financeID this is the first parameter of financing ID
     */
    public void setFinanceID(int financeID) {
        this.financeID = financeID;
    }


    /**
     * Getter of the Bank Name
     * @return bank name
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Setter of the Bank Name
     * @param bankName this is the first parameter of bank name
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * Getter of the Bank APR
     * @return the APR of the bank
     */
    public String getAPR() {
        return APR;
    }

    /**
     * Setter of the Bank APR
     * @param APR this is the first parameter of the bank APR
     */
    public void setAPR(String APR) {
        this.APR = APR;
    }

    /**
     * Getter of the Bank Term
     * @return term of the bank
     */
    public String getTerm() {
        return term;
    }

    /**
     * Setter of the Bank Term
     * @param term this is the first parameter of the Bank term
     */
    public void setTerm(String term) {
        this.term = term;
    }

    /**
     * Getter of the Revenue
     * @return the amount of revenue
     */
    public String getRevenue() {
        return Revenue;
    }

    /**
     * Setter of the Revenue
     * @param revenue this is the first parameter of Revenue
     */
    public void setRevenue(String revenue) {
        Revenue = revenue;
    }


    // METHODS ---------------------------------------------------------------------------------------

    /**
     * <h1>Finance Record</h1>
     * <p>The financeRecords method is called from the Menu Class
     * if you select option 4 from the Menu. It brings the user
     * into the Finance menu of options that are found in the
     * do statement.
     * The financeRecords method contains a switch statement based
     * off of the menu of options (Complete Finance Application,
     * Checking Status Application, Financing Options and Exit.</p>
     *
     * @param fiLoanOptionsArray this is the first parameter of financeRecords
     * @param customerArray this is the second parameter of financeRecords
     * @author  Aneta O'Donnell
     * @version 1.0
     * @since   3/28/2020
     */
    protected void financeRecords(FiLoanOptionsArray fiLoanOptionsArray, CustomerArray customerArray) {
        ArrayList flist = fiLoanOptionsArray.getfiLoanOptionsArray();

        int choice = 0;
        boolean flag = true;

        do {
            System.out.println("\nFINANCE MENU:\n1 - Complete Finance Application \n2 - Check Status Application \n3 - Financing Options \n4 - Run Finance Reports \n5 - Exit ");
            System.out.println("Enter your choice:");
            choice = -1;
            Scanner scnr = new Scanner(System.in);

            if (scnr.hasNextInt()) {
                choice = scnr.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("-- COMPLETE A FINANCE APPLICATION -- ");
                        customerArray.financeApplication();
                        break;
                    case 2:
                        System.out.println(" -- APPLICATION STATUS -- ");
                        customerArray.approvalDenial();
                        break;
                    case 3:
                        System.out.println(" -- FINANCING/LOAN OPTIONS -- ");
                        fiLoanOptions(flist);
                        break;
                    case 4:
                        System.out.println(" -- RUN FINANCE REPORT -- ");
                        runReport();
                        break;
                    case 5:
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
        while (choice != 5);
    }

    /*public void financeApplication() { //TODO: need to find customer from customer arraylist by SSN and add the info into their file
        System.out.println("Enter SSN to apply:");
        Scanner input = new Scanner(System.in);
        String SSN = input.nextLine();

        if (cList.equals(SSN)) {
            System.out.println("Customer with SSN: " + SSN + " applied!");
        } else {
            System.out.println("Sorry customer with SSN: " + SSN + " was not found!");
        }
    }*/

        /*for (int i=0; i<cList.size(); i++) {
            if (cList.get(i).SSN.equals(SSN)) {
                System.out.println("Customer with SSN: " + SSN + " applied!");
                break;
            }
            else{
                System.out.println("Sorry customer with SSN: " + SSN + " was not found!");
                break;
            }
        }
        System.out.println(SSN);*/







        /*Customers cust1 = new Customers();
        Scanner scnr = new Scanner(System.in);

        cust1.setCustID(cCount++);

        System.out.println("Please enter customer full name: ");
        cust1.setFullName(scnr.nextLine());

        System.out.println("Please enter customer address: ");
        cust1.setAddress(scnr.nextLine());

        System.out.println("Please enter customer phone number: ");
        cust1.setCustPhoneNumber(scnr.nextLine());

        System.out.println("Please enter customer license: ");
        cust1.setCustLicense(scnr.nextLine());

        System.out.println("Please enter customer SSN: ");
        cust1.setSSN(scnr.nextLine());

        cList.add(cust1);*/


        /*Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Customer SSN: ");
        SSN = scnr.nextLine();

        if (cList.contains(SSN)) {
            System.out.println("Apply");
        } else {
            System.out.println("Do not Apply.");
        }*/





    /*public void approvalDenial() { //TODO: based on the customer that applied need to get that customer and tell them they were approved
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
    }*/


        /*for (Customers clients : cList) {
            System.out.println(clients);
        }
        System.out.println(" ");
        System.out.println(" YOU HAVE BEEN APPROVED. ");*/

    /**
     * <h1>fiLoanOptions method</h1>
     * <p>The fiLoanOptions method prints the list of
     * finance loan options that are found in the FiLoanOptions Class.</p>
     *
     * @param fList this is the first parameter of fiLoanOptions
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 3/28/2020
     */
    public Boolean fiLoanOptions(ArrayList<Finance> fList){

        for(Finance finance : fList){
            System.out.println(finance);
        }
        return true;
    }

    /**
     * <h1>runReport method</h1>
     * <p>The runReport method prints out pre-set numbers of Revenue.</p>
     *
     * @author Houssam M.
     * @version 1.0
     * @since 3/28/2020
     */
    public void runReport() {
        System.out.println("Total Revenue for month of March: " + "$" + Revenue1);
        System.out.println("Total Revenue for month of April: " + "$"+ Revenue2);
        System.out.println("Total Revenue for month of May: " + "$"+ Revenue3);

    }

    /**
     * <h1>toString of Finance Loan Options</h1>
     * <p>The toString method is used to properly return
     * a String of text.</p>
     *
     * @return String of the Finance Loan Options object
     * @author  Aneta O'Donnell
     * @version 1.0
     * @since   3/28/2020
     */
    public String toString() {
        return String.format("\nBank Name: " + getBankName() + "\nAPR: " + getAPR() + "\nTerm: " + getTerm());
    }






}




