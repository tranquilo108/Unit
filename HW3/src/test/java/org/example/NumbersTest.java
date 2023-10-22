package org.example;


import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.assertThat;

class NumbersTest {
    Numbers numbers;
    @BeforeEach
    void setUp() {
        numbers = new Numbers();
    }

    @Test
    @DisplayName("Проверка метода кратности двум")
    void evenOddNumber() {
        assertThat(numbers.evenOddNumber(5)).isEqualTo(false);
        assertThat(numbers.evenOddNumber(4)).isEqualTo(true);
    }

    @Test
    @DisplayName("Проверка числа на попадание в интервал")
    void numberInInterval() {
        assertThat(numbers.numberInInterval(50)).isEqualTo(true);
        assertThat(numbers.numberInInterval(25)).isEqualTo(true);
        assertThat(numbers.numberInInterval(100)).isEqualTo(true);
        assertThat(numbers.numberInInterval(11)).isEqualTo(false);
    }
}