import java.util.List;

public class TortUrodzinowy {
    private List<Integer> listaSwieczek;
    private int najwieksza;
    private int licznikNajwiekszych;

    public TortUrodzinowy(List<Integer> listaSwieczek) {
        this.listaSwieczek = listaSwieczek;
        this.najwieksza = Integer.MIN_VALUE;
        this.licznikNajwiekszych = 0;
    }

    public List<Integer> getListaSwieczek() {
        return listaSwieczek;
    }

    public void znajdzNajwiekszaILicznik() {
        najwieksza = Integer.MIN_VALUE; // Zainicjowanie na początku
        licznikNajwiekszych = 0; // Zainicjowanie na początku

        for (int liczba : listaSwieczek) {
            if (liczba > najwieksza) {
                najwieksza = liczba;
                licznikNajwiekszych = 1; // Resetuj licznik
            } else if (liczba == najwieksza) {
                licznikNajwiekszych++;
            }
        }
    }

    public int getLicznikNajwiekszych() {
        return licznikNajwiekszych;
    }

    public int getNajwieksza() {
        return najwieksza;
    }
}
