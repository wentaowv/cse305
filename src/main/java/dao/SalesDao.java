package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.RevenueItem;

public class SalesDao {

    private List<RevenueItem> getDummyRevenueItems()
    {
        List<RevenueItem> items = new ArrayList<RevenueItem>();

		/*Sample data begins*/
        for (int i = 0; i < 10; i++) {
            RevenueItem item = new RevenueItem();
            item.setDate(new Date());
            item.setNumShares(5);
            item.setAccountId("foo");
            item.setPricePerShare(50.0);
            item.setStockSymbol("AAPL");
            item.setAmount(150.0);
            items.add(item);
        }
        /*Sample data ends*/

        return items;
    }
    public List<RevenueItem> getSalesReport(String month, String year) {
        System.out.println(month+year);
		/*
		 * The students code to fetch data from the database will be written here
		 * Query to get sales report for a particular month and year
		 */

        return getDummyRevenueItems();

    }



    public List<RevenueItem> getSummaryListing(String searchKeyword) {

		/*
		 * The students code to fetch data from the database will be written here
		 * Query to fetch details of summary listing of revenue generated by a particular stock,
		 * stock type or customer must be implemented
		 * Store the revenue generated by an item in the amount attribute
		 */

        return getDummyRevenueItems();
    }
}
