import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {

    CabInvoice cabInvoice = new CabInvoice();

    @Test
    public void givenDistanceAndTime_InvoiceGeneratorCalculateFare_ShouldReturnTotalFare() {
        double result = cabInvoice.getTotalFare(5, 10);
        Assert.assertEquals(result, 60, 0);
    }
}
