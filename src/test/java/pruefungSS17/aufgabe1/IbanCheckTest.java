package pruefungSS17.aufgabe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class IbanCheckTest {

    @Test
    public void ibanCheck() throws FalscheIBANException {
        assertTrue(IbanCheck.ibanCheck("DE12345678912345678912"));
    }

}