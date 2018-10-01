package com.tom.client;

import com.tom.model.Sector;

import java.io.UnsupportedEncodingException;

public class AppTest {

    //company historic data to chart V
    //company financials V
    //company search V (sectors) V
    //company overview V
    //search through all symbols V

    //filter
    //cache



    //https://iextrading.com/developer/docs/
    public static void main(String args[]) throws UnsupportedEncodingException {

        IEXClient client = new IEXClient();

        System.out.println(client.getCompanyInformation("goog"));
    }
}
