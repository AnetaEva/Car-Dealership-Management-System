/*
Author: Aneta
Project: Car Dealership
Purpose Details: Main class of the car dealership.
Course: IST 242
Team: 4
Date Developed: 3/1/2020
Last Date Changed: 4/5/2020
Rev: 2
*/


package edu.psu.abington.ist.ist242;

/**
 * <h1>Main Class</h1>
 * <p>The Main Class is the starting point for the program.</p>
 */
public class Main {
    /**
     * <h1>Main Method</h1>
     * <p>The Main Method calls the entire program.</p>
     * @param args
     */
    public static void main(String[] args) {


        Menu menu = new Menu(); // create a new instance of the MENU CLASS and then call MENUS methods
        menu.runMenu(); // calling menus methods but can only call the PUBLIC method



    }
}