import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CowTest {
    Cow zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzkjbgiywbjnfuiabdifbajhsfagvfadfbja;

    @Before
    public void setUp() throws Exception {
        zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzkjbgiywbjnfuiabdifbajhsfagvfadfbja = new Cow();
    }

    @Test(timeout = 100)
    public void TestSound() {assertEquals("Moo!", zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzkjbgiywbjnfuiabdifbajhsfagvfadfbja.sound()); }

    @Test(timeout = 100)
    public void TestGetMaxSpeed() { assertEquals (2, zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzkjbgiywbjnfuiabdifbajhsfagvfadfbja.getMaxSpeed()); }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzkjbgiywbjnfuiabdifbajhsfagvfadfbja.upgradeSpeed();
        assertEquals(3, zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzkjbgiywbjnfuiabdifbajhsfagvfadfbja.getMaxSpeed());
    }


    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(5, zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzkjbgiywbjnfuiabdifbajhsfagvfadfbja.getPrice());
    }
}

