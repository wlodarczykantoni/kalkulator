

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
                if(dane == null || dane.isEmpty()){
                    return 0;
                }

                String separator = ",|\n";
                String numbers = dane;
                String nowySeparator="";
                String zaDuzo="Liczba niemoze byc wieksza niz 1000";

                String kiedyNaMinusie = "liczby ujemne nie dozwolone"; //new


                if (dane.startsWith("//")) {
                    numbers = dane.substring(dane.indexOf("\n")+1);
                    nowySeparator = dane.substring(2, dane.indexOf("\n"));
                }
                separator = separator + "|" + separator;
                String[] danePodzielone = numbers.split(separator);

                Integer suma = 0;
                for (int i = 0; i < danePodzielone.length; i++) {
                    String liczba = danePodzielone[i];
                    suma += Integer.parseInt(liczba);
                }





                if (dane.startsWith("-")) {                     ////new
                    return Integer.valueOf(kiedyNaMinusie, Integer.parseInt(dane));

                }
            int liczba = Integer.parseInt(dane);
                if (liczba<= 1000) {
                    return Integer.valueOf(zaDuzo);
                }

                return suma;
            }
        }
