import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckTriangleTest {

    @Test
    void testSide2and2and2(){
        String  expected = "tam giác đều";
        String result = CheckTriangle.CheckTriangle(2, 2, 2);
        assertEquals(expected, result);
    }

    @Test
    void testSide2and2and3(){
        String  expected = "tam giác cân";
        String result = CheckTriangle.CheckTriangle(2, 2, 3);
        assertEquals(expected, result);
    }

    @Test
    void testSide3and4and5(){
        String  expected = "tam giác thường";
        String result = CheckTriangle.CheckTriangle(3, 4, 5);
        assertEquals(expected, result);
    }

    @Test
    void testSide8and2and3(){
        String  expected = "không phải tam giác";
        String result = CheckTriangle.CheckTriangle(8, 2, 3);
        assertEquals(expected, result);
    }

    @Test
    void testSideM1and2and1(){
        String  expected = "không phải tam giác";
        String result = CheckTriangle.CheckTriangle(-1, 2, 1);
        assertEquals(expected, result);
    }

    @Test
    void testSide0and1and1(){
        String  expected = "không phải tam giác";
        String result = CheckTriangle.CheckTriangle(0, 1, 1);
        assertEquals(expected, result);
    }
}