package org.walaszczyk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class WarmUpSecondTest {
    private WarmUpSecond warmUpSecond;

    @BeforeEach
    public void setUp() {
        this.warmUpSecond = new WarmUpSecond();
    }

    @Test
    void stringSplosionAssertCorrectAlgorithm() {

        //given
        String input = "temp";
        String output = "ttetemtemp";

        //when
        String correctAlgorithm = warmUpSecond.stringSplosion(input);

        //then
        assertEquals(correctAlgorithm, output);
    }

    @Test
    void stringSplosionAssertCorrectAlhorithmShort() {
        assertEquals(warmUpSecond.stringSplosion("temp"), "ttetemtemp");
    }

    @Test
    void strinSplosionAssertMany() {
        //given
        String input = "ab";
        String outputOne = "aab";
        String outputTwo = "aabb";

        assertAll(
                () -> assertEquals(warmUpSecond.stringSplosion(input), outputOne),
                () -> assertNotEquals(warmUpSecond.stringSplosion(input), outputTwo)

        );
    }

    @ParameterizedTest
    @ValueSource(strings = {"temp", "ab"})
    void test() {

    }

}