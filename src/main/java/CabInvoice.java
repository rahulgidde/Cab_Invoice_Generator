import java.util.ArrayList;

public class CabInvoice {
    //CONSTANT
    private static final double COST_PER_KILOMETER = 10;
    private static final int COST_PER_MINUTE = 1;
    private static final int MINIMUM_FARE = 5;

    //VARIABLE
    double totalFare = 0;

    RidRepository repository;

    public CabInvoice() {
        this.repository = new RidRepository();
    }

    //METHOD TO GET TOTAL FARE FOR JOURNEY
    public double getTotalFare(Ride[] rides) {
        for (Ride ride : rides) {
            totalFare += ride.journeyDistance * COST_PER_KILOMETER + ride.journeyTime * COST_PER_MINUTE;
        }
        return Math.max(MINIMUM_FARE, totalFare);
    }

    public InvoiceDetails getInvoiceDetails(String userId) {
        ArrayList userRides = repository.getRideDetails(userId);
        Ride[] rides = new Ride[userRides.size()];
        userRides.toArray(rides);
        double totalFare = getTotalFare(rides);
        return new InvoiceDetails(rides.length, totalFare);
    }

    public void addRide(String userId, Ride[] rides) {
        repository.addRide(userId, rides);
    }
}
