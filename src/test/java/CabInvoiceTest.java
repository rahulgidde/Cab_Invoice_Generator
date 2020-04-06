import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {

    @Test
    public void givenDistanceAndTime_InvoiceGeneratorCalculateFare_ShouldReturnTotalFare() {
        CabInvoice cabInvoice = new CabInvoice();
        double result = cabInvoice.getTotalFare(5, 10);
        Assert.assertEquals(result, 60, 0);
    }
}
