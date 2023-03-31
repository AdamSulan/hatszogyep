import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestHatszogyep {
    Hatszogyep hatszogyep;
    @BeforeEach
    public void init(){
        hatszogyep=new Hatszogyep();
    }
    @Test
    public void testCheckInput(){
        boolean actual=hatszogyep.checkInput("33");
        assertTrue("Nem fogadja el az integer bemenetet.", actual);
    }
    @Test
    public void testCheckInputFalse(){
        boolean actual=hatszogyep.checkInput("12a");
        assertFalse("Elfogadja a szöveges bemenetet.", actual);
    }
    @Test
    public void testCheckInputFloat(){
        boolean actual=hatszogyep.checkInput("24.5");
        assertTrue("Nem fogadja el a float bemenetet.", actual);
    }
    @Test
    public void testHatszogyep(){
        double actual=hatszogyep.szamitTerulet(10,10);
        assertEquals(actual, 389.71143170299734, 0.001, "Nem 389.71143170299734-t kaptam a 10 bemenetre.");
    }
    @Test
    public void testHatszogyep2(){
        double actual=hatszogyep.szamitTerulet(10,20);
        assertEquals(actual, 1169.1342951089923, 0.001, "Nem 1169.1342951089923-t kaptam a 25 bemenetre.");
    }
}
