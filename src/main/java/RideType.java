public enum RideType {

    NORMAL_RIDE(10, 1, 5),
    PREMIUM_RIDE(15, 2, 20);

    public final double costPerKilometer;
    public final int costPerMinute;
    public final int minimumFare;

    RideType(double costPerKilometer, int costPerMinute, int minimumFare) {
        this.costPerKilometer = costPerKilometer;
        this.costPerMinute = costPerMinute;
        this.minimumFare = minimumFare;
    }
}
