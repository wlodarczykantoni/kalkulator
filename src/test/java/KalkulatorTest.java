
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class KalkulatorTest {


    @Test
    void jezeliBedziePusteZwracaZero(){

        /// Given
        String dane = "";
        Integer liczby = 0;
        Kalkulator kalkulator = new Kalkulator();

        /// When

        Integer wynik = kalkulator.dodaj(dane);

        ////Then
        assertEquals(liczby, wynik);

    }
    @Test
    void jeeliDamyLIczbyPOPrzecinku(){

        /// Given
        String dane = "1,2,4,7,3,12,4";
        Integer liczby = 33;
        Kalkulator kalkulator = new Kalkulator();

        /// When

        Integer wynik = kalkulator.dodaj(dane);

        ////Then
        assertEquals(liczby, wynik);

    }
    @Test
    void jezeliDamyEnterPomiedzy(){

        /// Given
        String dane = "1\n2,3";
        Integer liczby = 6;
        Kalkulator kalkulator = new Kalkulator();

        /// When

     ////nie wiem
        assertEquals(liczby,wynik);
        ////Then
        assertEquals(liczby,wynik);

    }
    @Test
    void jezeliBedzieNullZwracaZero(){

        /// Given
        String dane = "";
        Integer liczby = 0;
        Kalkulator kalkulator = new Kalkulator();
        Integer wynik = null;
        /// When
        try{
            liczby=null;
            fail();
        }
        catch (NullPointerException exception) {

            assertEquals(liczby, wynik);
        }
        ////Then
        assertEquals(liczby, wynik);


    }

    private void fail() {
    }


}
