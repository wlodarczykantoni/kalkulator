

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
                // Nadanie wartosci

                String separator = ",";
                String numbers = dane;
                Integer suma = 0;

                // usuwanie zbednych znakow
                String[] liczby1 = dane.split(",|\n");//lub String[] liczby1 = dane.split(",|\n;:./");

                String[] liczby3 = dane.split(";");
                String[] liczby4 = dane.split(".");
                // Sprawdzenie czy cos jest
                if (dane.isEmpty()) {
                    return 0;
                }



                for (int i = 0; i < liczby1.length; i++) {
                    String liczba = liczby1[i];
                    suma += Integer.parseInt(liczba);
                }



                    // Sprawdzenie czy zaczyna sie od znaku nieliczbowego
                    if (dane.startsWith("//")) {
                        separator = dane.substring(2, 3);
                        //przejscie do nowej linijkki
                        numbers = dane.substring(dane.indexOf('\n') + 1);
                    }



                return suma;
            }
        }
