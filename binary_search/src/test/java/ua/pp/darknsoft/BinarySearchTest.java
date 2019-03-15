package ua.pp.darknsoft;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    int[] ara = new int[10];

    @Before
    public void init_ara() {
        for (int i = 0; i < ara.length; i++)
            ara[i] = i + 1;
    }

    @Test
    public void test01() {
        int result = MainClass.binarySearch(2, ara);
        assertEquals(1, result);
    }

    @Test
    public void test02() {
        int result = MainClass.binarySearch(28, ara);
        assertEquals(-1, result);
    }
}
