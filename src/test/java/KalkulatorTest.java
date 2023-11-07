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


        int parNum1 = Integer.valueOf(myString1);
        int parNum2 = Integer.valueOf(myString2);
        int parNum3 = Integer.valueOf(myString3);
        int parNum4 = Integer.valueOf(myString4);
        int parNum5 = Integer.valueOf(myString5);
        int parNum6 = Integer.valueOf(myString6);
        int parNum7 = Integer.valueOf(myString7);
        int parNum8 = Integer.valueOf(myString8);
        int parNum9 = Integer.valueOf(myString9);


        int result = parNum1 + parNum2;

        Assertions.assertEquals(3, result);//tescik



    }
}