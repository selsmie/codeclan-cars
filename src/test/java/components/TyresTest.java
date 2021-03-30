package components;

import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void before() {
        tyres = new Tyres(TyreType.WINTER);
    }

    @Test
    public void canGetTyreType() {
        assertEquals(TyreType.WINTER, tyres.getTyreType());
    }

}
