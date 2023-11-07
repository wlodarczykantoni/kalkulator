import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KalkulatorTest {
    @Test
    void simpleTest() {
        String myString1 = "1";
        String myString2 = "2";
        String myString3 = "3";
        String myString4 = "4";
        String myString5 = "5";
        String myString6 = "6";
        String myString7 = "7";
        String myString8 = "8";
        String myString9 = "9";


        int parNum1 = Integer.valueOf(myString1); // konwersja String na int
        System.out.println("Integer z typu String przy użyciu valueOf(): " + parNum1);
        int parNum2 = Integer.valueOf(myString2); // konwersja String na int
        int wynik = parNum2 + parNum1;

        int parNum1 = Integer.valueOf(myString1);
        int parNum2 = Integer.valueOf(myString2);

        int result = parNum1 + parNum2;

        Assertions.assertEquals(3, result);
    }
}
