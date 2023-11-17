import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class TortUrodzinowyTest {

    @Test
    public void testCzyZadnaLiczbaNieRownaSieZero() {
        // Given
        TortUrodzinowy tort = new TortUrodzinowy(List.of(2, 6, 6, 3, 7, 9, 2, 3, 6, 4));

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
        TortUrodzinowy tort = new TortUrodzinowy(List.of(2, 3, 6, 6, 7, 9, 2, 3, 6, 4));

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
        TortUrodzinowy tort = new TortUrodzinowy(List.of(2, 3, 6, 6, 7, 9, 2, 3, 6, 4));

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
        TortUrodzinowy tort = new TortUrodzinowy(List.of(2, 3, 6, 6, 7, 9, 2, 3, 6, 4));

        // When
        List<Integer> listaSwieczek = tort.getListaSwieczek();

        // Then
        for (Integer liczba : listaSwieczek) {
            Assertions.assertTrue(liczba >= 0);
        }
    }

    @Test
    public void ileSwieczekZdmuchanieBabcia() {
        // Given
        TortUrodzinowy tort = new TortUrodzinowy(List.of(2, 3, 6, 5, 7, 9, 2, 3, 6, 4));
        Integer oczekiwanaNajwieksza = 9;
        Integer oczekiwanyLicznikNajwiekszych = 1;

        // When
        tort.znajdzNajwiekszaILicznik();
        Integer najwieksza = tort.getNajwieksza();
        Integer licznikNajwiekszych = tort.getLicznikNajwiekszych();

        // Then
        Assertions.assertEquals(oczekiwanaNajwieksza, najwieksza, "Najwieksza liczba powinna wynosic 9");
        Assertions.assertEquals(oczekiwanyLicznikNajwiekszych, licznikNajwiekszych, "Licznik najwiekszych powinien wynosic 1");
    }

}

