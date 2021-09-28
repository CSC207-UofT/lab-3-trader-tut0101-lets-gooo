import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpaceShuttleTest {
    SpaceShuttle shuttle;

    @Before
    public void setUp() throws Exception {
        shuttle = new SpaceShuttle();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(28000, shuttle.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        shuttle.upgradeSpeed();
        assertEquals(28100, shuttle.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        shuttle.downgradeSpeed();
        assertEquals(27900, shuttle.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1700000000, shuttle.getPrice());
    }

}
