import com.hamilton.contracts.IDriver;
import com.hamilton.contracts.TransfersContract;
import com.hamilton.definition.Driver;
import org.junit.Test;

public class Check {

    private String driverType = "android";
    private IDriver iDriver = new Driver();
    private TransfersContract transfersContract = new PaymentsTransfer();


    @Test
    public void checkInstance(){
        System.out.println(iDriver.getDriver(driverType));
        transfersContract.sendMoney();
    }
}
