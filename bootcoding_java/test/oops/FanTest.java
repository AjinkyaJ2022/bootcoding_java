package oops;

import com.bootcoding.oops.Fan;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class FanTest extends TestCase {

    @Test
    public void testSpeedIncrease() {
        Fan f1=new Fan();
       int b= f1.speedIncrease(5);
        Assert.assertEquals(5,b);

    }
    @Test
    public void testSpeedIncrease1() {
        Fan f1=new Fan();
        int b= f1.speedIncrease(9);
        Assert.assertEquals(5,b);

    }
    @Test
    public void testSpeedIncrease2() {
        Fan f1=new Fan();
        int b= f1.speedIncrease(-2);
        Assert.assertEquals(0,b);

    }
}