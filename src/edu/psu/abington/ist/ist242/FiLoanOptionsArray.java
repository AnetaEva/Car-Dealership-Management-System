/*
Author: Aneta
Project: Car Dealership
Purpose Details: Contains the finance array object for information related to the financing options.
Course: IST 242
Team: 4
Date Developed: 4/17/2020
Last Date Changed: 4/18/2020
Rev: 1
*/

package edu.psu.abington.ist.ist242;

import java.util.ArrayList;

/**
 * <h1>FiLoanOptionsArray Class</h1>
 * <p>The FiLoanOptionArray class contains an array list
 * of a few different banks with their respective options.</p>
 *
 * @author Aneta O'Donnell
 * @version 1.0
 * @since 4/18/2020
 */
public class FiLoanOptionsArray {

    ArrayList<Finance> fList;
    int fCount = 1;

    /**
     * Finance Loan Options Constructor
     */
    public FiLoanOptionsArray(){

        fList = new ArrayList<Finance>();

        Finance fiList1 = new Finance();
        Finance fiList2 = new Finance();
        Finance fiList3 = new Finance();

        fiList1.setFinanceID(fCount++);
        fiList1.setBankName("Bank of America");
        fiList1.setAPR("4.00");
        fiList1.setTerm("5 Years - 60 Months");
        fList.add(fiList1);


        fiList2.setFinanceID(fCount++);
        fiList2.setBankName("Wells Fargo");
        fiList2.setAPR("3.75");
        fiList2.setTerm("6 Years - 72 Months");
        fList.add(fiList2);


        fiList3.setFinanceID(fCount++);
        fiList3.setBankName("PNC");
        fiList3.setAPR("3.80");
        fiList3.setTerm("5 Years - 60 Months");
        fList.add(fiList3);

    }

    /**
     * <h1>Getter for fiLoanOptionsArray</h1>
     *
     * @return ArrayList fList which contains contents that are in the Finance Loan Options Array.
     */
    public ArrayList getfiLoanOptionsArray() {
        return fList;
    }
}


