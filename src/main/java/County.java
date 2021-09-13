/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class County {
    private final String countyName;
    private final double countyTax;

    public County(String countyName, double countyTax) {
        this.countyName = countyName;
        this.countyTax = countyTax;
    }

    public double getCountyTax() {
        return countyTax;
    }

    public String getCountyName() {
        return countyName;
    }
}
