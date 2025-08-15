import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitMethodsTest {

    @Test
    void testIsMultipleOf5() {
        int num1 = 10;
        boolean expected = true;
        JunitMethods j = new JunitMethods();
        boolean actual = j.multiple(num1);
        assertEquals(expected,actual);
        System.out.println(actual);

    }

    @Test
    void testIsMultipleOf20(){
        int num1 = 20;
        boolean expected = true;
        JunitMethods j = new JunitMethods();
        boolean actual = j.multiple(num1);
        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void testIsMultipleOf43(){
        int num1 = 43;
        boolean expected = false;
        JunitMethods j = new JunitMethods();
        boolean actual = j.multiple(num1);
        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void testIsMultipleOfMinus25(){
        int num1 = -25;
        boolean expected = true;
        JunitMethods j = new JunitMethods();
        boolean actual = j.multiple(num1);
        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void testLargest10a25a1(){
        int num1 = 10;
        int num2 = 25;
        int num3 = 1;

        int expected = 25;
        JunitMethods j = new JunitMethods();
        int actual = j.checkLargest(num1, num2, num3);
        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void testLargestMinus7a325a1200(){
        int num1 = -7;
        int num2 = 325;
        int num3 = 1200;

        int expected = 1200;
        JunitMethods j = new JunitMethods();
        int actual = j.checkLargest(num1,num2,num3);
        assertEquals(expected,actual);
        System.out.println(actual);
    }

    @Test
    void testMinus8aMinus1a0(){
        int num1 = -8;
        int num2 = -1;
        int num3 = 0;

        int expected = 0;
        JunitMethods j = new JunitMethods();
        int actual = j.checkLargest(num1,num2,num3);
        assertEquals(expected,actual);
        System.out.println(actual);
    }

    @Test
    void test20a20a20(){
        int num1 = 20;
        int num2 = 20;
        int num3 = 20;

        int expected = 20;
        JunitMethods j = new JunitMethods();
        int actual = j.checkLargest(num1,num2,num3);
        assertEquals(expected,actual);
        System.out.println(actual);
    }

    @Test
    void testABCD(){
        String word = "ABCD";

        String expected = "CDAB";
        JunitMethods j = new JunitMethods();
        String actual = j.swap(word);
        System.out.println(actual);
        assertEquals(expected,actual);
    }

    @Test
    void test

}
