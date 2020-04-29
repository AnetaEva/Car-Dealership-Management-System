/*
Author: Aneta
Project: Car Dealership
Purpose Details: Contains the transaction array object for information related to the car inventory.
Course: IST 242
Team: 4
Date Developed: 4/24/2020
Last Date Changed: 4/24/2020
Rev: 1
*/

package edu.psu.abington.ist.ist242;

import java.util.ArrayList;

/**
 * <h1>TransactionArray Class</h1>
 * <p>The TransactionArray class contains an array list
 * of a few different transaction with their respective descriptions.</p>
 *
 * @author Aneta O'Donnell
 * @version 1.0
 * @since 4/18/2020
 */
public class TransactionArray {

    ArrayList<Sales> sList;

    /**
     * TransactionArray Constructor
     */
    public TransactionArray(){

        sList = new ArrayList<Sales>();

        Sales tran1 = new Sales ();
        tran1.setTransactionId ("1");
        tran1.setSubTotal (39999);
        tran1.setTotalPrice (42398.94);
        tran1.setPaymentType (PaymentType.cash);
        tran1.setCommission (6359);


        Sales tran2 = new Sales ();
        tran2.setTransactionId ("2");
        tran2.setSubTotal (27899);
        tran2.setTotalPrice (29572.94);
        tran2.setPaymentType (PaymentType.credit);
        tran2.setCommission (4435);


        Sales tran3 = new Sales ();
        tran3.setTransactionId ("3");
        tran3.setSubTotal (42899);
        tran3.setTotalPrice (45472.94);
        tran3.setPaymentType (PaymentType.credit);
        tran3.setCommission (6820);


        sList.add (tran1);
        sList.add (tran2);
        sList.add (tran3);

    }

    /**
     * <h1>Getter for the TransactionArray</h1>
     *
     * @return ArrayList sList which contains contents that are in the Transactions Array list.
     */
    public ArrayList getTransactionArray() {
        return sList;
    }
}
