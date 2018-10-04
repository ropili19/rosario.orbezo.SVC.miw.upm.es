package src.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.C32;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C32Test {
    private C32 c32;

    @BeforeEach
    void before() {
        c32 = new C32();
    }

    @Test
    void testMA() {
        assertEquals("mA", c32.mA());
    }
}
