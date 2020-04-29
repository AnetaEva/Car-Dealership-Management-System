/*
Project: Car Dealership
Purpose Details: Sales object that contains information about sales
Course: IST 242
Team: 4
Date Developed: 3/28/2020
Last Date Changed: 4/24/2020
Rev:
 */

package edu.psu.abington.ist.ist242;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * <h1>Sales class</h1>
 * <p>The Sales class holds the data members and methods that will make a sale at the dealership. </p>
 *
 * @author Aneta O'Donnell
 * @version 1.0
 * @since 3/28/2020
 */
public class Sales extends Vehicle {

    ArrayList<Sales> sList = new ArrayList<Sales>();
    /**
     * Counter to automatically generate sales transaction IDs
     * @author Aneta O'Donnell
     */
    int sCount = 1;
    /**
     * Enumeration of the Payment Type
     */
    private PaymentType paymentType;
    /**
     * Transaction ID
     */
    private String transactionId;
    /**
     * Commission
     */
    private double commission;
    /**
     * Subtotal
     */
    private double subTotal;
    /**
     * Total Price
     */
    private double totalPrice;
    /**
     * Tax rate
     */
    private double tax = 1.06;

    /**
     * Employee Sales ID
     */
    private String empSalesID;
    /**
     * Sales Employee Full Name
     */
    private String sfullName;

    /**
     * Sales Constructor
     */
    public Sales(){

    }



    // GETTERS & SETTERS ------------------------------------------------------------------------------

    /**
     * Getter for the Commission
     * @return commission
     */
    public double getCommission() {
        return commission;
    }

    /**
     * Setter for the Commission
     * @param commission this is the first parameter of commission
     */
    public void setCommission(double commission) {
        this.commission = commission;
    }

    /**
     * Getter of the Transaction ID
     * @return transaction ID number
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Setter of the transaction ID
     * @param transactionId this is the first parameter of transaction ID
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Getter for the Subtotal
     * @return the subtotal
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * Setter for the subtotal
     * @param subTotal this is the first parameter of subtotal
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * Getter of Total Price
     * @return the total price
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Setter of Total Price
     * @param totalPrice this is the first parameter of total price
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * Getter for the enumeration Payment Type
     * @return payment Type
     */
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Setter for the enumeration Payment Type
     * @param paymentType this is the first parameter of payment type
     */
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Getter for the Employee Sales ID
     * @return
     */
    public String getEmpSalesID() {
        return empSalesID;
    }

    /**
     * Setter for the Employee Sales ID
     * @param empSalesID
     */
    public void setEmpSalesID(String empSalesID) {
        this.empSalesID = empSalesID;
    }

    /**
     * Getter of the Sales Employee Full Name
     * @return sales employee full name
     */
    public String getSfullName() {
        return sfullName;
    }

    /**
     * Setter for the Sales Employee Full Name
     * @param sfullName this is the first parameter of Sales Employe Full Name
     */
    public void setSfullName(String sfullName) {
        this.sfullName = sfullName;
    }




    // METHODS -----------------------------------------------------------------------------------------


    /**
     * <h1>Sales Record</h1>
     * <p>The salesRecords method is called from the Menu Class
     * if you select option 3 from the Menu. It brings the user
     * into the Sales menu of options that are found in the
     * do statement.
     * The salesRecords method contains a switch statement based
     * off of the menu of options (Manage Customer Profile, Sell Car,
     * Run Transactions Report and Exit.</p>
     *
     * @param customerArray this is the first parameter of salesRecords
     * @param transactionArray this is the first parameter of salesRecords
     * @author  Aneta O'Donnell
     * @version 1.0
     * @since   3/28/2020
     */
    protected void salesRecords(CustomerArray customerArray, TransactionArray transactionArray) {
        ArrayList slist = transactionArray.getTransactionArray();
        int choice = 0;
        boolean flag = true;

        do {
            System.out.println("\nSALES MENU:\n1 - Sell Car \n2 - Run Transactions Report \n3 - Exit ");
            System.out.println("Enter your choice:");
            choice = -1;
            Scanner scnr = new Scanner(System.in);

            if (scnr.hasNextInt()) {
                choice = scnr.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println(" -- SELL CAR -- ");
                        sellCar();
                        break;
                    case 2:
                        System.out.println(" -- TRANSACTIONS REPORTS -- ");
                        listTransactions(slist);
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



    // METHODS --------------------------------------------------------------------------------------------


    /**
     * <h1>sellCar method</h1>
     * <p>The sellCar method is used to sell a car in the dealership.
     * It creates new objects of sales manager, sales transaction,
     * customers, and cars. It asks for user inputs based on the
     * sales person selling the car, the price of the car, the Vin of the car
     * that is being sold, the customer name and prints out the recorded
     * transaction.</p>
     *
     * @return tran the transaction of user inputs
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 3/28/2020
     */
    public Vehicle sellCar() {
        Scanner scnr = new Scanner(System.in);
        Sales salesManager = new Sales(); // Sales Manager constructor
        Sales tran = new Sales(); //Sales transaction constructor
        Customers cust = new Customers(); //Customer constructor
        Vehicle car = new Vehicle(); //Car constructor


        System.out.println("Enter transaction ID: ");
        transactionId = Exception.testAlphaNumeric(Exception.getInput());
        tran.setTransactionId(transactionId);
        sList.add(tran);

        System.out.println("Please enter employee ID: ");
        empSalesID = Exception.testAlphaNumeric(Exception.getInput());
        salesManager.setEmpSalesID(empSalesID);

        System.out.println("Please enter employee name: ");
        sfullName = Exception.testAlpha(Exception.getInput());
        salesManager.setSfullName(sfullName);


        System.out.println("Enter the VIN of the Car: ");
        car.vin = Exception.testAlphaNumeric(Exception.getInput());
        car.setVin(car.vin);


        System.out.println("Enter the sticker price of car as a double: ");
        double subTotal = scnr.nextDouble();
        tran.setSubTotal(subTotal);
        sList.add(tran);

        System.out.println("Enter customer full name: ");
        cust.fullName = Exception.testAlpha(Exception.getInput());
        cust.setFullName(cust.fullName);

        tran.setPaymentType(); //TODO: if user select credit card enum should we have a credit card class with info?
        //TODO: similarly for fiLoanOptions if user selects financing

        //user input
        //if user input == financing then go to Finance.filoanoptions
        //ask which option are they choosing
        //set that filoanoption as the payment type

        System.out.println(" ");
        System.out.println("---- PSU Car Dealership ----");
        System.out.println("     1600 Woodland Road     ");
        System.out.println("     Abington, PA 19001     ");
        System.out.println("        215-555-1212        ");
        System.out.println("     -- SALE RECORD --      ");
        System.out.println(" ");
        System.out.println("Transaction ID: " + tran.getTransactionId());
        System.out.println("Sold To: " + cust.getFullName());
        System.out.println("Employee ID #: " + salesManager.getEmpSalesID());
        System.out.println("Employee Name: " + salesManager.getSfullName());
        System.out.println("Car VIN: " + car.getVin());
        System.out.println("Car Sticker Price: " + tran.getSubTotal());
        //System.out.println("Payment Type: " + PaymentType.cash); //TODO: need to change this to reflect user input from above

        System.out.println(" ");

        tran.setTotalPrice(calculateTransaction(tran.getSubTotal(), tax));
        System.out.println("Total price is w/ taxes: $" + getTotalPrice());
        System.out.println("Commission earned: $" + df2.format(tran.setSalesCommission(getTotalPrice())));
        System.out.println(" ");
        System.out.println("-- TRANSACTION RECORDED -- ");

        sList.add(tran);

        return tran;

    }



    /**
     * <h1>setPaymentType method</h1>
     * <p>Prompt user to select payment type based on the Payment enumeration.</p>
     *
     * @return payment
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 3/28/2020
     */
    public PaymentType setPaymentType(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter payment type ( 'cash / 'credit' / 'financing' ): ");
        PaymentType _payment = PaymentType.valueOf(scanner.next().toLowerCase());
        return _payment;
    }

    /**
     * <h1>setSalesCommission method </h1>
     * <p>The setSalesCommission method sets a salesperson's
     * commission.</p>
     *
     * @param _value a double
     * @return commission
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 3/28/2020
     */
    public double setSalesCommission(double _value) {
        double comm = _value*0.15;
        return comm;
    }



    /**
     * <h1>listTransactions method</h1>
     * <p>The listTransaction method will print list of preset transactions
     * that are located in the TransactionArray class</p>
     * @param sList Sales Transaction array list
     * @author Aneta O'Donnell
     */
    public void listTransactions(ArrayList<Sales> sList) { //TODO: fix how to add transaction to the slist from the user input

        for (Sales tran : sList) {
            System.out.println();
            System.out.println("Transaction ID: " + tran.getTransactionId());
            System.out.println("Subtotal: $" + df2.format(tran.getSubTotal()));
            System.out.println("Total price: $" + df2.format(tran.getTotalPrice()));
            System.out.println("Payment type: " + tran.getPaymentType());
            System.out.println("Commission from sale: $" + df2.format(tran.getCommission()));
        }
    }

    /**
     * <h1>DecimalFormat method</h1>
     * <p>The DecimalFormat method indicates how the format
     * of decimal/price should be.</p>
     *
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 3/28/2020
     */
    private static DecimalFormat df2 = new DecimalFormat("#.00");

    /**
     * <h1>calculateTransaction method</h1>
     * <p>The calculateTransaction method multiplies subtotal and tax, then rounds it.</p>
     *
     * @param transactionSubtotal This is the first parameter of calculateTransaction
     * @param tax tax rate of 6%
     * @return totalPrice
     * @author Aneta O'Donnell
     */
    public double calculateTransaction(double transactionSubtotal, double tax) {
        totalPrice = transactionSubtotal * tax;
        totalPrice = Math.round(totalPrice*100.0)/100.0;
        return totalPrice;
    }




}
