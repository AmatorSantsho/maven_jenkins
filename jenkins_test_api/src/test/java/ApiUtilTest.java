import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

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