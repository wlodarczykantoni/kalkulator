import java.util.ArrayList;
import java.util.List;

public class TortUrodzinowy {

    public static void main(String[] args) {
        List<Integer> listaSwieczek = new ArrayList<>();
        listaSwieczek.add(2);
        listaSwieczek.add(4);
        listaSwieczek.add(6);
        listaSwieczek.add(9);
        listaSwieczek.add(6);
        listaSwieczek.add(6);
        listaSwieczek.add(7);
        listaSwieczek.add(1);
        listaSwieczek.add(2);
        listaSwieczek.add(6);

        // szukanie najwiekszej
        int najwieksza = Integer.MIN_VALUE;

        for (int i = 0; i < listaSwieczek.size(); i++) {
            int liczba = listaSwieczek.get(i);

            if (liczba > najwieksza) {
                najwieksza = liczba;
            }
        }

        System.out.println("Najwieksza liczba w liscie " + najwieksza);

        // szukanie najwiekszej i licenie ileich jest
        int licznikNajwiekszych = 0;
        for (int liczba : listaSwieczek) {
            if (liczba == najwieksza) {
                licznikNajwiekszych++;
            }
        }

        System.out.println("Ilosc wystepien najwiekszej liczby " + licznikNajwiekszych);
    }


    public List<Integer> getListaSwieczek() {
        return getListaSwieczek();
    }
}
