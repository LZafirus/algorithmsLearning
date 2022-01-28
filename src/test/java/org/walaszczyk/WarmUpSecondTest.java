package org.walaszczyk;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class WarmUpSecondTest {
    WarmUpSecond warmUpSecond;

    @BeforeEach
    public void setUp() {
        warmUpSecond = new WarmUpSecond();
    }

    @Test
    void shouldReturnString() {
        assertEquals("temp", "temp");
    }

    @Test
    void test() {

        assertEquals(warmUpSecond.stringSplosion("temp"), "temptemp");
    }

    @Test
    void checkingIfBothAreEqualsStringSplsion() {

        assertEquals(warmUpSecond.stringSplosion("ta"), "tta");

    }

}