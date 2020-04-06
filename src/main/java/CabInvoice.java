public class CabInvoice {
    //CONSTANT
    double COST_PER_KILOMETER = 10;
    int COST_PER_MINUTE = 1;
    int MINIMUM_FARE = 5;

    //VARIABLE
    double totalFare = 0;

    //METHOD TO GET TOTAL FARE FOR JOURNEY
    public double getTotalFare(Ride[] rides) {
        for (Ride ride : rides) {
            totalFare += ride.journeyDistance * COST_PER_KILOMETER + ride.journeyTime * COST_PER_MINUTE;
        }
        return Math.max(MINIMUM_FARE, totalFare);
    }

    //MAIN METHOD
    public static void main(String[] args) {
        System.out.println("----------Welcome To Cab Invoice Generator------------");
    }
}
