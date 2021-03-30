package components;

import components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine(8);
    }

    @Test
    public void canGetEngineSize() {
        assertEquals(8, engine.getEngineSize());
    }
}
