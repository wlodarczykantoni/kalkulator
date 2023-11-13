
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

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
        Integer wynik = kalkulator.dodaj(dane);

     ////nie wiem
        assertEquals(liczby,wynik);
        ////Then
        assertEquals(liczby,wynik);

    }
    @Test
    void jezeliBedzieNullZwracaZero(){

        /// Given
        String dane = null;
        Integer liczby = 0;
        Kalkulator kalkulator = new Kalkulator();
        Integer wynik = null;
        /// When
        try{
            wynik = kalkulator.dodaj(dane);
            fail();
        }
        catch (NullPointerException exception) {

            assertEquals("Cannot invoke \"String.isEmpty()\" because \"dane\" is null", exception.getMessage());

        }
        ////Then



    }

    @Test
    void jezeliBedzieEnter () {
        /// Given
        String dane = "1\n2\n3";
        Integer oczekiwanyWynik = 6;
        Kalkulator kalkulator = new Kalkulator();

        /// When
        Integer wynik = kalkulator.dodaj(dane);

        //// Then
        assertEquals(oczekiwanyWynik, wynik);

    }

    @Test
    void jezeliMaBYcSeparator() {
        /// Given
        String dane = "//@\n1@2@3";
        Integer oczekiwanyWynik = 6;
        Kalkulator kalkulator = new Kalkulator();

        /// When
        Integer wynik = kalkulator.dodaj(dane);

        //// Then
        assertEquals(oczekiwanyWynik, wynik);

    }



    @Test
    void jezeliBedzieMinus() {
        /// Given
        String dane = "-1,2,-3";
        String kiedyNaMinusie = "liczby ujemne nie dozwolone";
        Kalkulator kalkulator = new Kalkulator();

        /// When
        Integer wynik = kalkulator.dodaj(dane);

        //// Then
        assertEquals(Integer.valueOf(kiedyNaMinusie), wynik);
    }


   @Test
    void jezeliBedzieZaDuzo() {
        /// Given
        String dane = "1001";
        String kiedyZaDuzo = "powyzej 1000 nie wolno";
        Kalkulator kalkulator = new Kalkulator();

        /// When
        Integer wynik = kalkulator.dodaj(dane);

        //// Then
        assertEquals(Integer.valueOf(kiedyZaDuzo), wynik);
    }

}
