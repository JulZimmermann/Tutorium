package termin20Dezember17;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddiererTest {

    @Test
    public void addiereInt() throws Exception {

        String erg = Addierer.addiere("1", "1");

        assertEquals(erg, "2");
    }


    @Test
    public void addiereDouble() throws Exception {

        String erg = Addierer.addiere("1.1", "0.1");

        assertEquals(erg, "1.2");
    }

}