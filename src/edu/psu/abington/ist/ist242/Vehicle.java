/*
Author: Aneta
Project: Car Dealership
Purpose Details: Contains the car object with user input for information related to the cars.
Course: IST 242
Team: 4
Date Developed: 3/18/2020
Last Date Changed: 4/23/2020
Rev:
*/

package edu.psu.abington.ist.ist242;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <h1> Car </h1>
 * <p>The Car class holds the data members and methods that will add cars to the dealership.</p>
 *
 * @author Aneta O'Donnell
 * @version 1.0
 * @since 4/21/2020
 */
public class Vehicle {

    /**
     * Enum Prior Use, new or used
     */
    protected PriorUse priorUse;
    /**
     * Vin number
     */
    protected String vin;
    /**
     * The year the car was made
     */
    protected String year;
    /**
     * Car model
     */
    protected String model;
    /**
     * Car make
     */
    protected String make;
    /**
     * Car Price
     */
    protected String price;
    /**
     * Car mileage
     */
    protected String mileage;
    /**
     * Enum Exterior Color
     */
    protected ExteriorColor exColor;
    /**
     * Enum Number of Doors
     */
    protected NumDoors numOfDoors;


    /**
     * Getter for Enum Exterior Color
     * @return enum of exterior color
     */
    public ExteriorColor getExColor() {
        return exColor;
    }

    /**
     * Setter for Enum Exterior Color
     * @param exColor this is the first parameter of Enum Exterior Color
     */
    public void setExColor(ExteriorColor exColor) {
        this.exColor = exColor;
    }

    /**
     * Getter for Enum NumDoors
     * @return enum of number of doors
     */
    public NumDoors getNumOfDoors() {
        return numOfDoors;
    }

    /**
     * Setter for Enum NumDoors
     * @param numOfDoors this is the first parameter of Enum NumDoors
     */
    public void setNumOfDoors(NumDoors numOfDoors) {
        this.numOfDoors = numOfDoors;
    }






    /**
     * Getter for Enum PriorUse
     * @return enum prior use
     */
    public PriorUse getPriorUse() {
        return priorUse;
    }

    /**
     * Setter for Enum PriorUse
     * @param priorUse this is the first parameter of Enum PriorUse
     */
    public void setPriorUse(PriorUse priorUse) {
        this.priorUse = priorUse;
    }

    /**
     * Getter for Vin number
     * @return VIN number of the car
     */
    public String getVin() {
        return vin;
    }

    /**
     * Setter for the Vin number
     * @param vin this is the first parameter of Vin Number
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * Getter for the Year
     * @return Year the car was made
     */
    public String getYear() {
        return year;
    }

    /**
     * Setter for the Year
     * @param year this is the first parameter of Year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * Getter for Car Model
     * @return the Model type of the car
     */
    public String getModel() {
        return model;
    }

    /**
     * Setter of the Car Model
     * @param model this is the first parameter of the Model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Getter of the Car Make
     * @return the Make type of the car
     */
    public String getMake() {
        return make;
    }

    /**
     * Setter of the Car Make
     * @param make this is the first parameter of the Make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Getter for the Car Price
     * @return the Price of the car
     */
    public String getPrice() {
        return price;
    }

    /**
     * Setter of the Car Price
     * @param price this is the first parameter of the Price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * Getter of the Car Mileage
     * @return the mileage of the Car
     */
    public String getMileage() {
        return mileage;
    }

    /**
     * Setter of the Car Mileage
     * @param mileage this is the first parameter of the Mileage
     */
    public void setMileage(String mileage) {
        this.mileage = mileage;
    }
    /**
     * Car Constructor
     * @param vin this is the first parameter of Car Constructor
     */
    public Vehicle(String vin) { //constructor for car vin
    }

    /**
     * Empty Car Constructor
     */
    public Vehicle() {

    }





    /*public String toString() {
        return String.format("%-10s | %-10s | %-12s | %-10s | %-10s | %-10s \n", getVin(), getYear(), getMake(), getModel(), getPrice(), getMileage());
    }*/

    /**
     * <h1>setNumOfDoors sets vehicle door number</h1>
     * <p>It asks for user input and then returns the number
     * of doors, which are preset by the NumDoors enumeration.
     * This method is used inside the methods to add car
     * so that after user enters the specific number, car setters
     * store this information to the Car object being created.</p>
     *
     * @return number of doors
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 4/23/2020
     */
    public NumDoors setNumOfDoors() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of doors ('two' / 'four'): ");
        numOfDoors = NumDoors.valueOf(input.next().toLowerCase());
        return numOfDoors;
    }

    /**
     * <h1>setExColor sets the exterior car color</h1>
     * <p>It asks for user input and then returns the exterior color
     * of the car that is available, which are preset in the Exterior
     * Color enumeration. This method is used inside the methods to add
     * cars so that after user enters the specific exterior color, car setters
     * store this information to the Car object being created. </p>
     *
     * @return exterior color of car
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 4/23/2020
     */
    public ExteriorColor setExColor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter car exterior color ( 'white' / 'grey' / 'black' / 'orange' / 'yellow' / 'green' / 'blue' / 'silver' / 'gold' / 'red' / 'purple' ): ");
        exColor = ExteriorColor.valueOf(input.next().toLowerCase());
        return exColor;
    }

    /**
     * <h1>setPriorUse sets whether car is used or new</h1>
     * <p>It asks for user input and then returns whether the car is
     * used or new, which is preset in the Transmission
     * enumeration. This method is used inside the methods to add
     * cars so that after user enters the specific prior use if any, car setters
     * store this information to the Car object being created. </p>
     *
     * @return prior use of car
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 4/23/2020
     */
    public PriorUse setPriorUse() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter prior use( '_new' / '_used' ): ");
        priorUse = PriorUse.valueOf(input.next().toLowerCase());
        return priorUse;
    }





    /**
     * <h1>toString of Car object</h1>
     * <p>The toString method is used to properly return
     * a String of text.</p>
     *
     * @return String of the Car object
     * @author  Aneta O'Donnell
     * @version 1.0
     * @since   4/23/2020
     */
    @Override
    public String toString() { //TODO:
        return String.format("\nNew or Used: " + this.priorUse + "\nVIN: " + this.vin + "\nYear: " + this.year +
                "\nModel: " + this.model + "\nMake: " + this.make + "\nPrice: " + this.price + "\nMileage: " +
                this.mileage + "\nNumber of Doors: " + this.numOfDoors + "\nExterior Color: " + this.exColor + "\n");
    }




}


