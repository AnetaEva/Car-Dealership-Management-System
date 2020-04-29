/*
Author: Aneta
Project: Car Dealership
Purpose Details: Contains the car array object for information related to the car inventory.
Course: IST 242
Team: 4
Date Developed: 4/18/2020
Last Date Changed: 4/18/2020
Rev: 1
*/

package edu.psu.abington.ist.ist242;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <h1>CarArray Class</h1>
 * <p>The CarArray class contains an array list
 * of a few different cars with their respective specifications.</p>
 *
 * @author Aneta O'Donnell
 * @version 1.0
 * @since 4/18/2020
 */
public final class Car extends Vehicle {

    ArrayList<Vehicle> carsList1;
    //int carCount = 101;

    /**
     * CarArray Constructor
     */
    public Car() {

        carsList1 = new ArrayList<Vehicle>();

        Vehicle car2 = new Vehicle("1J3PKL27");
        car2.setVin("1J3PKL27");
        car2.setPriorUse(PriorUse._used);
        car2.setYear("2018");
        car2.setModel("Civic");
        car2.setMake("Honda");
        car2.setExColor(ExteriorColor.blue);
        car2.setNumOfDoors(NumDoors.four);
        car2.setPrice("$22,899");
        car2.setMileage("15,000");

        Vehicle car3 = new Vehicle("1R5THU33");
        car3.setVin("1R5THU33");
        car3.setPriorUse(PriorUse._used);
        car3.setYear("2016");
        car3.setModel("Corvette Stingray");
        car3.setMake("Chevrolet");
        car3.setExColor(ExteriorColor.black);
        car3.setNumOfDoors(NumDoors.two);
        car3.setPrice("$41,899");
        car3.setMileage("17,000");

        Vehicle car4 = new Vehicle("1GPT8659");
        car4.setVin("1GPT8659");
        car4.setPriorUse(PriorUse._used);
        car4.setYear("2019");
        car4.setModel("Mustang GT Premium");
        car4.setMake("Ford");
        car4.setExColor(ExteriorColor.grey);
        car4.setNumOfDoors(NumDoors.two);
        car4.setPrice("$34,899");
        car4.setMileage("12,000");

        Vehicle car5 = new Vehicle("1TJGNK456");
        car5.setVin("1TJGNK456");
        car5.setPriorUse(PriorUse._new);
        car5.setYear("2020");
        car5.setModel("Explorer Sport");
        car5.setMake("Ford");
        car5.setExColor(ExteriorColor.black);
        car5.setNumOfDoors(NumDoors.four);
        car5.setPrice("$34,899");
        car5.setMileage("10,000");


        carsList1.add(car2);
        carsList1.add(car3);
        carsList1.add(car4);
        carsList1.add(car5);
    }

    public Car(String vin) {
    }


    /**
     * <h1>Getter for ArrayList of CarArray</h1>
     *
     * @return ArrayList carsList1 which contains contents that are in the Car Array.
     */
    public ArrayList getCarArray() {
        return carsList1;
    }

    // METHODS --------------------------------------------------------------------------
    /**
     * <h1>Car Record</h1>
     * <p>The carRecord method is called from the Menu Class
     * if you select option 2 from the Menu. It brings the user
     * into the Inventory menu of options that are found in the
     * do statement.
     * The customerRecord method contains a switch statement based
     * off of the menu of options (Add Car, Print Inventory, Delete
     * and Exit.</p>
     *
     * @param carArray this is the first parameter of customerRecord
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 4/23/2020
     */
    protected void carRecord(Car carArray) {
        ArrayList carsList1 = carArray.getCarArray();
        int choice = 0;
        boolean flag = true;

        do {
            System.out.println("\nINVENTORY MENU:\n1 - Add Car \n2 - Print Inventory \n3 - Delete \n4 - Exit ");
            System.out.println("Enter your choice:");
            choice = -1;
            Scanner scnr = new Scanner(System.in);

            if (scnr.hasNextInt()) {
                choice = scnr.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("-- ADD A NEW CAR -- ");
                        addCar(carArray);
                        break;
                    case 2:
                        System.out.println("-- CURRENT INVENTORY -- ");
                        printInventory(carsList1);
                        break;
                    case 3:
                        System.out.println(" -- DELETE CAR --");
                        carArray.deleteCar(vin);
                        break;
                    case 4:
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
        while (choice != 4);
    }
    /**
     * <h1>addCar Method</h1>
     * <p>The addCar method is used to add a car into the inventory.
     * It asks for user input based on a series of questions
     * pertaining to the car specification and description.</p>
     *
     * @param carArray This is the first parameter of addCar method
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 4/23/2020
     * @return
     */
    public Vehicle addCar(Car carArray) {
        Vehicle car1 = new Vehicle();
        Scanner scnr = new Scanner(System.in);

        car1.setPriorUse();

        System.out.println("Please enter VIN number: "); //alphanumeric
        vin = Exception.testAlphaNumeric(Exception.getInput());
        car1.setVin(vin);

        System.out.println("Please enter car year: ");
        car1.setYear(scnr.nextLine());

        System.out.println("Please enter car make: "); //alpha
        make = Exception.testAlpha(Exception.getInput());
        car1.setMake(make);

        System.out.println("Please enter car model: "); //alpha
        model = Exception.testAlpha(Exception.getInput());
        car1.setModel(model);

        System.out.println("Please enter car price: "); //double
        price = Exception.testDouble(Exception.getInput());
        car1.setPrice(price);

        System.out.println("Please enter car mileage: ");
        car1.setMileage(scnr.nextLine());

        //goes to the set doors method at the bottoms and asks how many doors then sets it
        car1.setNumOfDoors();

        // goes to the set exterior color method at the bottom
        car1.setExColor();

        carArray.carsList1.add(car1);

        System.out.println(car1);

        return car1;

    }

    /**
     * <h1>deleteCar method</h1>
     * <p>The Delete Car method asks for user input based on
     * the VIN number of the car for deletion. It then stores the
     * vin in a String. If the car list array contains the input vin
     * number then it will remove the vin and update the inventory
     * printing out the car has been removed. If the VIN is not found
     * the print out statement will display car was not found.</p>
     *
     * @author Aneta O'Donnell
     * @version 1.0
     * @since 4/23/2020
     */

    public Boolean deleteCar(String vin) {
        System.out.println("Enter VIN to delete:");
        Scanner input = new Scanner(System.in);
        input.nextLine();
        try {
            for (Vehicle c : carsList1) {
                if (c.vin.equals(vin)) {
                    carsList1.remove(c);
                    System.out.println("Car with VIN: " + vin + " removed!");
                    break;
                }
            }
        } catch (java.lang.Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * <h1>printInventory method</h1>
     * <p>The printInventory method is used to print or display
     * all car in the dealership inventory that are in the system.</p>
     *
     * @param carsList1 This is the first parameter of the printInventory method
     * @author Aneta O'Donnell
     * @version 1.0
     * @since   4/21/2020
     * @return
     */
    public Boolean printInventory(ArrayList<Vehicle> carsList1) {
        for (Vehicle car : carsList1) {
            System.out.println(car);
        }
        return true;
    }
}
