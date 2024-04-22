import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MainTest {
    @Test
    public void testMainCanBeInstantiated() {
        Main main = new Main();
        assertNotNull(main);
    }
}