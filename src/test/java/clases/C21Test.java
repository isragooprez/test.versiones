package clases;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;;

public class C21Test {
    @Before
    public void Before() {
        new C21();
    }

    @Test
    public void M1() {
        assertEquals("m1", C21.m1());
    }

    @Test
    public void M2() {
        assertEquals("m2", C21.m2());
    }
    @Test
    public void M3() {
        assertEquals("m3", C21.m3());
    }
}
