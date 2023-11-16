import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TortUrodzinowyTest {

    @Test
    public void testCzyZadnaLiczbaNieRownaSieZero() {
        // Given
        TortUrodzinowy tort = new TortUrodzinowy();

        // When
        List<Integer> listaSwieczek = tort.getListaSwieczek();

        // Then
        for (Integer liczba : listaSwieczek) {
            Assertions.assertNotEquals(0, liczba);
        }
    }

    @Test
    public void testCzyZadnaLiczbaNieJestNullem() {
        // Given
        TortUrodzinowy tort = new TortUrodzinowy();

        // When
        List<Integer> listaSwieczek = tort.getListaSwieczek();

        // Then
        for (Integer liczba : listaSwieczek) {
            Assertions.assertNotNull(liczba);
        }
    }

    @Test
    public void testCzyZadnaLiczbaNieJestWiekszaNiz10() {
        // Given
        TortUrodzinowy tort = new TortUrodzinowy();

        // When
        List<Integer> listaSwieczek = tort.getListaSwieczek();

        // Then
        for (Integer liczba : listaSwieczek) {
            Assertions.assertTrue(liczba <= 10);
        }
    }

    @Test
    public void testCzyZadnaLiczbaNieJestNaMinusie() {
        // Given
        TortUrodzinowy tort = new TortUrodzinowy();

        // When
        List<Integer> listaSwieczek = tort.getListaSwieczek();

        // Then
        for (Integer liczba : listaSwieczek) {
            Assertions.assertTrue(liczba >= 0);
        }
    }
}
