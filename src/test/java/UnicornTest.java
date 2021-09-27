import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class UnicornTest {

        Unicorn u;

    @Before

    public void setup() throws Exception {
        u = new Unicorn();
    }

    @Test   (timeout = 50) // This is a timeout

    public void TestSound() { // This is public
        assertEquals("Magical Noises", u.sound());
    }

    @Test   (timeout = 50) // This is also a timeout

    public void TestGetMaxSpeed() { // This is also public
        assertEquals(
                100000,
                u.getMaxSpeed()
        );
    }

    @Test   (timeout = 50) // This is also a timeout

    public void TestDowngradeSpeed() { // This is also public
        u.downgradeSpeed();
        assertEquals(99999, u.getMaxSpeed());
    }

    @Test       (timeout = 50) // This is also a timeout

    public void TestGetPrice() { // This is also public
        assertEquals(
                100000,
                u.getPrice()
        );
    }
}
