package termin13Dezember17.leetTranslator;

import java.io.IOException;
import java.io.Writer;

public class LeetWriter extends Writer {

    private static final char[] DICTIONARY = { '4','b','c','d','3','f','6',
                                               'h','1','j','k','l','m','n',
                                               '0','p','q','r','5','7','0',
                                               'v','w','x','y','z' };

    private Writer writer;


    public LeetWriter(Writer writer) throws IOException {
        super(writer);
        this.writer = writer;
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        writer.write(cbuf, off, len);
    }

    @Override
    public void write(String str) throws IOException {
        String leetStr = translate(str);
        writer.write(leetStr);
    }

    @Override
    public void flush() throws IOException {
        writer.flush();
    }

    @Override
    public void close() throws IOException {
        writer.close();
    }

    private String translate(String wort) {
        char[] wortArray = wort.toLowerCase().toCharArray();
        String newWort = "";

        for(char c : wortArray) {
            if(c >= 'a' && c <= 'z') {
                newWort += DICTIONARY[c - 'a'];
            } else {
                newWort += c;
            }
        }

        return newWort;
    }


}
