package src.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.src.C52;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C52Test {
    private C52 c52;

    @BeforeEach
    void before() {
        c52 = new C52();
    }

    @Test
    void testMA() {
        assertEquals("mA", c52.mA());
    }
}
