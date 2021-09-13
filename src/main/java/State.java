/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Tyler Snowdon
 */
enum State {

    WISCONSIN("Wisconsin", 0.05, new County("Eau Claire", 0.005), new County("Dunn", 0.004)),
    ILLINOIS("Illinois", 0.08);

    private final String displayName;
    private final double stateTax;
    private final County[] counties;

    State(String displayName, double stateTax, County... counties) {
        this.displayName = displayName;
        this.stateTax = stateTax;
        this.counties = counties;
    }

    public static State getState(String input) {
        for (State state : values()) {
            if (state.getDisplayName().equalsIgnoreCase(input) || state.name().equalsIgnoreCase(input)) {
                return state;
            }
        }
        return null;
    }

    public String getDisplayName() {
        return displayName;
    }

    public double getStateTax() {
        return stateTax;
    }

    public County[] getCounties() {
        return counties;
    }

    public County getCounty(String input){
        for (County county : counties) {
            if (county.getCountyName().equalsIgnoreCase(input)) {
                return county;
            }
        }
        return null;
    }
}
