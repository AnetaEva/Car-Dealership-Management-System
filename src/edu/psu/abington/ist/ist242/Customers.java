/*
Author: Aneta
Project: Car Dealership
Purpose Details: Contains the customer object with user input for information related to the customer.
Course: IST 242
Team: 4
Date Developed: 3/1/2020
Last Date Changed: 4/23/2020
Rev: 1
*/

package edu.psu.abington.ist.ist242;

import java.util.*;

/**
 * <h1> Customers </h1>
 * <p>The Customer class holds the data members and methods that will add customers to the dealership.</p1>
 *
 * @author Aneta O'Donnell
 * @version 1.0
 * @since 4/21/2020
 */
public class Customers {



    /**
     * Unique identification number of each customer
     * @author Aneta O'Donnell
     */
    public int custID;
    /**
     * Customers full name
     * @author Aneta O'Donnell
     */
    protected String fullName;
    /**
     * Customers address
     * @author Aneta O'Donnell
     */
    protected String address;
    /**
     * Customers Social Security Number
     * @author Aneta O'Donnell
     */
    protected String SSN;
    /**
     * Customers License Number
     * @author Aneta O'Donnell
     */
    protected String custLicense;
    /**
     * Customers Phone Number
     * @author Aneta O'Donnell
     */
    protected String custPhoneNumber;

    /**
     * empty Customer Constructor
     */
    public Customers() {

    }

    /**
     * Getter for Customer ID
     * @return int custID
     * @param s
     */
    public int getCustID(String s) {
        return custID;
    }

    /**
     * Setter for Customer ID
     * @param custID this is the first parameter of custID
     */
    public void setCustID(int custID) {
        this.custID = custID;
    }

    /**
     * Getter for Customer Full Name
     * @return String fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Setter for Customer Full Name
     * @param fullName this is the first parameter of fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Getter for Customer Address
     * @return String address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter for Customer Address
     * @param address this is the first parameter of address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Getter for Customer Social Security Number
     * @return String SSN
     */
    public String getSSN() {
        return SSN;
    }

    /**
     * Setter for Customer Social Security Numner
     * @param SSN this is the first parameter of SSN
     */
    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    /**
     * Getter for Customer License Number
     * @return String custLicense
     */
    public String getCustLicense() {
        return custLicense;
    }

    /**
     * Setter for Customer License Number
     * @param custLicense this is the first parameter of custLicense
     */
    public void setCustLicense(String custLicense) {
        this.custLicense = custLicense;
    }

    /**
     * Getter for Customer Phone Number
     * @return String custPhoneNumber
     */
    public String getCustPhoneNumber() {
        return custPhoneNumber;
    }

    /**
     * Setter for Customer Phone Number
     * @param custPhoneNumber this is the first parameter of custPhoneNumber
     */
    public void setCustPhoneNumber(String custPhoneNumber) {
        this.custPhoneNumber = custPhoneNumber;
    }






    /**
     * <h1>toString of Customer</h1>
     * <p>The toString method is used to properly return
     * a String of text.</p>
     *
     * @return String of the Customer object
     * @author  Aneta O'Donnell
     * @version 1.0
     * @since   4/21/2020
     */
    @Override
    public String toString() {
        return String.format("\nCustomer ID: " + this.custID + "\nFull Name: " + this.fullName + "\nAddress: " + this.address + "\nPhone Number: " + this.custPhoneNumber + "\nLicense: " + this.custLicense + "\nSSN: " + this.SSN);
    }



}


