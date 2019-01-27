import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiUtilTest {

    ApiUtil apiUtil = new ApiUtil();

    @Test
    public void mult() {
        Assert.assertEquals(apiUtil.mult(3,3),9);
    }

    @Test
    public void count() {
        Assert.assertEquals(apiUtil.count("Hello"),5);
    }
}