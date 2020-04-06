import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {

    CabInvoice cabInvoice = new CabInvoice();

    @Test
    public void givenDistanceAndTime_InvoiceGeneratorCalculateFare_ShouldReturnTotalFare() {
        double result = cabInvoice.getTotalFare(5, 10);
        Assert.assertEquals(result, 60, 0);
    }

    @Test
    public void givenDistanceAndTime_InvoiceGeneratorCalculateFare_ShouldReturnMinimumFare() {
        double result = cabInvoice.getTotalFare(0.1, 4);
        Assert.assertEquals(5, result, 0);
    }
}
