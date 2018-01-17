package termin13Dezember17.leetTranslator;

import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class LeetWriterTest {

    private ByteArrayOutputStream stream;
    private Writer writer;

    @Before
    public void before() {
        try {
            stream = new ByteArrayOutputStream();
            writer = new LeetWriter(new OutputStreamWriter(stream));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void writeLatters() throws Exception {
        writer.write("hallo");
        writer.flush();

        String erg = stream.toString();

        assertEquals("h4ll0", erg);
    }

    @Test
    public void writeUpercase() throws Exception {
        writer.write("HALLO");
        writer.flush();

        String erg = stream.toString();

        assertEquals("h4ll0", erg);
    }

    @Test
    public void writeNumbers() throws Exception {
        writer.write("1234");
        writer.flush();

        String erg = stream.toString();

        assertEquals("1234", erg);
    }

    @Test
    public void writeSpecial() throws Exception {
        writer.write("&&");
        writer.flush();

        String erg = stream.toString();

        assertEquals("&&", erg);
    }

}