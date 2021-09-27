import org.junit.Before;
import org.junit.Test;

public class CowTest {
    Cow c;

    @Before
    public void setUp() throws Exception {
        c = new Cow();
    }

    @Test(timeout = 100)
    public void TestSound() {assertEquals("Moo!", c.sound()); }

    @Test(timeout = 100)
    public void TestGetMaxSpeed() { assertEquals (2, c.getMaxSpeed()); }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(2,c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        c.downgradeSpeed();
        assertEquals(0,c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(5, c.getPrice());
    }
}

