

        import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;


        import static org.junit.jupiter.api.Assertions.assertEquals;
        import static org.junit.jupiter.api.Assertions.assertTrue;
        import static org.junit.jupiter.api.Assumptions.assumingThat;

public class Kalkulator {
    public static void main(String[] args) {

////////////////
System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
        String myString1 = "1";
        String myString2 = "2";
        String myString3 = "3";
        String myString4 = "4";
        String myString5 = "5";
        String myString6 = "6";
        String myString7 = "7";
        String myString8 = "8";
        String myString9 = "9,3,4";
        myString9 = myString9.replaceAll(",", ""); //usuwa przecinek
        myString9 = myString9.replaceAll("\\s", ""); // usuwa spacje



        int parNum1 = Integer.valueOf(myString1);
        System.out.println("Integer z typu String przy użyciu valueOf(): " + parNum1);
        int parNum2 = Integer.valueOf(myString2);
        int parNum9 = Integer.valueOf(myString9);
        int wynik = parNum2 + parNum9;
        System.out.println("Suma 1 i 2:  " + wynik);

    }
}