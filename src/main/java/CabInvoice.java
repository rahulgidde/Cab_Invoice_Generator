public class CabInvoice {
    //CONSTANT
    double COST_PER_KILOMETER = 10;
    int COST_PER_MINUTE = 1;
    int MINIMUM_FARE = 5;

    //VARIABLES
    double totalFare = 0;

    //METHOD TO GET TOTAL FARE FOR JOURNEY
    public double getTotalFare(double distance, int time) {
        totalFare = distance * COST_PER_KILOMETER + time * COST_PER_MINUTE;
        return totalFare;
    }

    //MAIN METHOD
    public static void main(String[] args) {
        System.out.println("----------Welcome To Cab Invoice Generator------------");
    }
}
