import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {

    CabInvoice cabInvoice = new CabInvoice();

    @Test
    public void givenDistanceAndTime_InvoiceGeneratorCalculateFare_ShouldReturnTotalFare() {
        double result = cabInvoice.getTotalFare(20, 30, RideType.NORMAL_RIDE);
        Assert.assertEquals(result, 230, 0);
    }

    @Test
    public void givenDistanceAndTime_InvoiceGeneratorCalculateFare_ShouldReturnMinimumFare() {
        double result = cabInvoice.getTotalFare(0.1, 1, RideType.NORMAL_RIDE);
        Assert.assertEquals(5, result, 0);
    }

    @Test
    public void givenMultipleRides_InvoiceGeneratorCalculateAggregate_ShouldReturnFareAggregate() {
        Ride[] rides = {new Ride(15, 30), new Ride(25, 50)};
        String userId = "123";
        cabInvoice.addRide(userId, rides);
        InvoiceDetails invoiceDetails = cabInvoice.getInvoiceDetails(userId, RideType.NORMAL_RIDE);
        Assert.assertEquals(480, invoiceDetails.totalFare, 0);
    }

    @Test
    public void givenDistanceAndTime_InvoiceGeneratorCalculateFare_ShouldReturnInvoiceDetails() {
        Ride[] rides = {new Ride(15, 30), new Ride(25, 50)};
        String userId = "123";
        cabInvoice.addRide(userId, rides);
        InvoiceDetails invoiceDetails = cabInvoice.getInvoiceDetails(userId, RideType.NORMAL_RIDE);
        InvoiceDetails expectedDetails = new InvoiceDetails(2, 480);
        Assert.assertEquals(invoiceDetails, expectedDetails);
    }

    @Test
    public void givenRidesAndUserId_InvoiceGeneratorCalculateFare_ShouldReturnInvoiceDetailsList() {
        Ride[] rides = {new Ride(20, 20), new Ride(30, 30)};
        String userId = "112";
        cabInvoice.addRide(userId, rides);
        InvoiceDetails invoiceDetails = cabInvoice.getInvoiceDetails(userId, RideType.NORMAL_RIDE);
        InvoiceDetails expectedDetails = new InvoiceDetails(2, 550);
        Assert.assertEquals(invoiceDetails, expectedDetails);
    }

    @Test
    public void givenUserIdSndRideType_InvoiceGeneratorCalculateFare_ShouldReturnInvoiceDetails() {
        Ride[] rides = {new Ride(20, 20), new Ride(30, 30)};
        String userId = "112";
        cabInvoice.addRide(userId, rides);
        InvoiceDetails invoiceDetails = cabInvoice.getInvoiceDetails(userId, RideType.PREMIUM_RIDE);
        InvoiceDetails expectedDetails = new InvoiceDetails(2, 850);
        Assert.assertEquals(invoiceDetails, expectedDetails);
    }
}
