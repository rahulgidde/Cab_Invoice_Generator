public class InvoiceDetails {

    public final double numberOfRides;
    public final double totalFare;
    public final double averageFarePerRide;

    public InvoiceDetails(double numberOfRides, double totalFare) {
        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
        this.averageFarePerRide = totalFare / numberOfRides;
    }
}
