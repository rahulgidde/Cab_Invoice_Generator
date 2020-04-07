import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {

    CabInvoice cabInvoice = new CabInvoice();

    @Test
    public void givenDistanceAndTime_InvoiceGeneratorCalculateFare_ShouldReturnTotalFare() {
        Ride[] rides = {new Ride(20, 30)};
        double result = cabInvoice.getTotalFare(rides);
        Assert.assertEquals(result, 230, 0);
    }

    @Test
    public void givenDistanceAndTime_InvoiceGeneratorCalculateFare_ShouldReturnMinimumFare() {
        Ride[] rides = {new Ride(0.1, 1)};
        double result = cabInvoice.getTotalFare(rides);
        Assert.assertEquals(5, result, 0);
    }

    @Test
    public void givenMultipleRides_InvoiceGeneratorCalculateAggregate_ShouldReturnFareAggregate() {
        Ride[] rides = {new Ride(15, 30), new Ride(25, 50)};
        double result = cabInvoice.getTotalFare(rides);
        Assert.assertEquals(480, result, 0);
    }

    @Test
    public void givenDistanceAndTime_InvoiceGeneratorCalculateFare_ShouldReturnInvoiceDetails() {
        Ride [] rides = {new Ride(20,20), new Ride(30,50)};
        double result = cabInvoice.getTotalFare(rides);
        InvoiceDetails invoiceDetails = cabInvoice.getInvoiceDetails(rides);
        InvoiceDetails expectedDetails = new InvoiceDetails(4,5);
        Assert.assertEquals(invoiceDetails, expectedDetails);
     }
}
