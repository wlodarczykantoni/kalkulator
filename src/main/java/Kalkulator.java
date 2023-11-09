

        import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;


        import static org.junit.jupiter.api.Assertions.assertEquals;
        import static org.junit.jupiter.api.Assertions.assertTrue;
        import static org.junit.jupiter.api.Assumptions.assumingThat;

public class Kalkulator {
    public Integer dodaj(String dane) {
        if (dane.isEmpty()) {
            return 0;
        }

        String[] liczby1 = dane.split(",|\n");//lub  String[] liczby1 = dane.split(",|\n;:./");
        String[] liczby2 = dane.split(",");
        String[] liczby3 = dane.split(";");
        String[] liczby4 = dane.split(".");

        Integer suma = 0;

        for (int i = 0; i < liczby1.length; i++) {
            String liczba = liczby1[i];
            suma += Integer.parseInt(liczba);
        }

        return suma;
    }
}