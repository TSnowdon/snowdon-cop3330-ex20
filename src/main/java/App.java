import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class App {

    public static void main(String[] args) {
        int amount;
        String stateInput;
        String countyInput;
        double taxedAmount = 0;
        double total;
        Scanner reader = new Scanner(System.in);
        try {
            System.out.print("What is the order amount? ");
            amount = Integer.parseInt(reader.nextLine());
            System.out.print("What state do you live in? ");
            stateInput = reader.nextLine();

            State state = State.getState(stateInput);
            if (state != null) {
                taxedAmount = amount * state.getStateTax();

                if (state.getCounties().length != 0) {
                    System.out.print("What county do you live in? ");
                    countyInput = reader.nextLine();
                    County county = state.getCounty(countyInput);
                    if (county != null) {
                        taxedAmount += amount * county.getCountyTax();
                    }
                }
                System.out.printf("The tax is $%.2f.\n", taxedAmount);
            }
            total = amount + taxedAmount;
            System.out.printf("The total is $%.2f.\n", total);
        } catch (Exception e) {
            System.out.println("Invalid input, please restart the program and try a different value.");
        }
    }
}
