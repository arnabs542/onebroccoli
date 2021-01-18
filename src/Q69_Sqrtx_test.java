import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Q69_Sqrtx_test {
    @Test
    public void SqrtxTest () {
        int n = 8;
        Q69_Sqrtx s = new Q69_Sqrtx();
        int result = s.mySqrt(n);
        int expected = 2;
        assertEquals(expected, result);
    }


}
