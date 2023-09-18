import com.codebase.WaterBottle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle nalgene;

    @Before
    public void before() {
        nalgene = new WaterBottle();
    }

    @Test
    public void hasVolume() {
        assertEquals(100, nalgene.getVolume());
    }

    @Test
    public void canDrink() {
        nalgene.drink();
        nalgene.drink();
        assertEquals(80, nalgene.getVolume());
    }

    @Test
    public void canEmpty() {
        nalgene.empty();
        assertEquals(0, nalgene.getVolume());
    }

    @Test
    public void canFill() {
        nalgene.fill();
        assertEquals(100, nalgene.getVolume());
    }
}
