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
