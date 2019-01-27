
import org.junit.Assert;
import org.junit.Test;



public class UiUtilTest {
    UiUtil uiUtil =new UiUtil();

    @Test
    public void add() {
        Assert.assertEquals(uiUtil.add(5,4),9);
    }

    @Test
    public void concat() {
        Assert.assertEquals(uiUtil.concat("a","b"),"ab");
    }
}
