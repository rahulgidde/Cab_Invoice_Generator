public class CabInvoice {
    //CONSTANT
    private double COST_PER_KILOMETER = 10;
    private int COST_PER_MINUTE = 1;
    private int MINIMUM_FARE = 5;

    //VARIABLE
    double totalFare = 0;

    //METHOD TO GET TOTAL FARE FOR JOURNEY
    public double getTotalFare(Ride[] rides) {
        for (Ride ride : rides) {
            totalFare += ride.journeyDistance * COST_PER_KILOMETER + ride.journeyTime * COST_PER_MINUTE;
        }
        return Math.max(MINIMUM_FARE, totalFare);
    }
}
