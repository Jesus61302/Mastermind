import org.junit.Test;

import static org.junit.Assert.*;

public class PegTest {

    @Test
    public void returnPegs1() {
        int numPegs = 4;
        String guess = "YBRO";
        String code = "YBRO";
        String expected = "4b_0w";
        String result = Peg.returnPegs(4,guess,code);
        assertEquals(expected, result);

    }

    @Test
    public void returnPegs2() {
        int numPegs = 4;
        String guess = "RRRR";
        String code = "YBRO";
        String expected = "1b_0w";
        String result = Peg.returnPegs(4,guess,code);
        assertEquals(expected, result);

    }
    @Test
    public void returnPegs3() {
        int numPegs = 4;
        String guess = "BYOR";
        String code = "YBRO";
        String expected = "0b_4w";
        String result = Peg.returnPegs(4,guess,code);
        assertEquals(expected, result);

    }
    @Test
    public void returnPegs4() {
        int numPegs = 4;
        String guess = "EDFP";
        String code = "YBRO";
        String expected = "0b_0w";
        String result = Peg.returnPegs(4,guess,code);
        assertEquals(expected, result);

    }
    @Test
    public void returnPegs5() {
        int numPegs = 4;
        String guess = "BBYO";
        String code = "YBRO";
        String expected = "2b_1w";
        String result = Peg.returnPegs(4,guess,code);
        assertEquals(expected, result);

    }
}