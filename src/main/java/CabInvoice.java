import java.util.ArrayList;

public class CabInvoice {
    //CONSTANT
    private static double COST_PER_KILOMETER;
    private static int COST_PER_MINUTE;
    private static int MINIMUM_FARE;

    //VARIABLE
    double totalFare = 0;

    RidRepository repository = new RidRepository();

    //METHOD TO GET TOTAL FARE FOR JOURNEY
    public double getTotalFare(Ride[] rides) {
        for (Ride ride : rides) {
            totalFare += ride.journeyDistance * COST_PER_KILOMETER + ride.journeyTime * COST_PER_MINUTE;
        }
        return Math.max(MINIMUM_FARE, totalFare);
    }

    //METHOD TO GET INVOICE
    public InvoiceDetails getInvoiceDetails(String userId) {
        ArrayList userRides = repository.getRideDetails(userId);
        Ride[] rides = new Ride[userRides.size()];
        userRides.toArray(rides);
        double totalFare = getTotalFare(rides);
        return new InvoiceDetails(rides.length, totalFare);
    }

    //METHOD TO ADD RIDES
    public void addRide(String userId, Ride[] rides) {
        repository.addRide(userId, rides);
    }
}
