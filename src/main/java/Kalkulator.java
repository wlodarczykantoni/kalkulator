

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
                String nowySeparator2 ="";
                String zaDuzo="Liczba niemoze byc wieksza niz 1000";

                String kiedyNaMinusie = "liczby ujemne nie dozwolone"; //new


                if (dane.startsWith("//")) {
                    numbers = dane.substring(dane.indexOf("\n")+1);
                    nowySeparator = dane.substring(2, dane.indexOf("\n"));
                }

                separator = separator + "|" + nowySeparator;
                String[] danePodzielone = numbers.split(separator);

                Integer suma = 0;
                for (int i = 0; i < danePodzielone.length; i++) {
                    String liczba = danePodzielone[i];
                    suma += Integer.parseInt(liczba);
                }





                if (dane.startsWith("-")) {                     ////new
                    return Integer.valueOf(kiedyNaMinusie, Integer.parseInt(dane));

                }


                if (dane.startsWith("//") || dane.contains("[***]")) {
                    numbers = dane.substring(dane.indexOf("\n")+1);
                    nowySeparator2 = dane.substring(2, dane.indexOf("\n"));
                    if (dane.startsWith("//")) {
                        dane = dane.substring(dane.indexOf("\n") + 1);
                    }

                    if (dane.contains("[***]")) {
                        dane = dane.substring(dane.indexOf("[***]") + 5);
                    }

                    if (dane.contains("\n")) {
                        dane = dane.substring(dane.indexOf("\n") + 2);
                    }

                    if (dane.contains("***")) {
                        dane = dane.substring(dane.indexOf("***") + 3);
                    }



                }
                separator = separator + "|" + nowySeparator2;
                String[] danePodzielone2 = numbers.split(separator);
                Integer suma2 = 0;
                for (int i = 0; i < danePodzielone2.length; i++) {
                    String liczba = danePodzielone2[i];
                    suma2 += Integer.parseInt(liczba);
                    return suma2;

                }


                return suma;

            }
        }
