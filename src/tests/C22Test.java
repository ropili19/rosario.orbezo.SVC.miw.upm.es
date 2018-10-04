package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.C22;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C22Test {
    private C22 c22;

    @BeforeEach
    void before() {
        c22 = new C22();
    }

    @Test
    void testMA() {
        assertEquals("mA", c22.mA());
    }
}
