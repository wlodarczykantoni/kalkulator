

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
        String str = "111";

        int num1 = Integer.parseInt(str);
        System.out.println("parseInt(String): "
                + num1);

        int num2 = Integer.parseInt(str, 2);
        System.out.println("parseInt(String o podstawie 2): " + num2);
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
        String myString9 = "9";


        int parNum1 = Integer.valueOf(myString1);
        System.out.println("Integer z typu String przy użyciu valueOf(): " + parNum1);
        int parNum2 = Integer.valueOf(myString2);
        int wynik = parNum2 + parNum1;
        System.out.println("Suma 1 i 2:  " + wynik);

    }
}