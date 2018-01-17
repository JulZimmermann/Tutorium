package termin13Dezember17.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KugelVolumenTest {

    @Before
    void xy() {

    }

    @Test
    public void berechneKugelvolumen() throws Exception {

        double erg = KugelVolumen.berechneKugelvolumen(0);
        assertEquals(0, erg, 0.01);
        erg = KugelVolumen.berechneKugelvolumen(1.5);
        assertEquals(14.137, erg, 0.01);
        erg = KugelVolumen.berechneKugelvolumen(-1);
        assertEquals(4.189, erg, 0.01);

    }

}