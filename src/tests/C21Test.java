package src.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.C21;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class C21Test {
    private C21 C21;

    @BeforeEach
    void before() {
        C21 = new C21();
    }

    @Test
    void testM1() {
        assertEquals("m1", C21.m1());
    }
    @Test
    void testM2() {
        assertEquals("m2", C21.m2());
    }
}