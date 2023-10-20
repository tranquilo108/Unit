package org.example.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void init(){
        calculator = new Calculator();
    }
    @Test
    @DisplayName("Проверка скидки 10% и стоимости 500")
    void calculatingDiscountTenPercent() {
        assertThat(Calculator.calculatingDiscount(500, 10)).isEqualTo(450);
    }
    @Test
    @DisplayName("Проверка скидки 0%")
    void calculatingDiscountZeroPercent() {
        assertThat(Calculator.calculatingDiscount(500, 0)).isEqualTo(500);
    }
    @Test
    @DisplayName("Проверка исключения при передаче цены 0")
    void calculatingDiscountWithZeroPrice() {
        assertThatThrownBy(() ->{Calculator.calculatingDiscount(0, 10);}).isInstanceOf(ArithmeticException.class);
    }
    @Test
    @DisplayName("ArithmeticException при отрицательной цене")
    void calculatingDiscountWithNegativePrice() {
        assertThatThrownBy(() ->{Calculator.calculatingDiscount(-500, 10);}).isInstanceOf(ArithmeticException.class);
    }
    @Test
    @DisplayName("ArithmeticException при отрицательной скидке")
    void calculatingDiscountWithNegativeDiscount() {
        assertThatThrownBy(() ->{Calculator.calculatingDiscount(500, -10);}).isInstanceOf(ArithmeticException.class);
    }
    @Test
    @DisplayName("ArithmeticException при скидке >99%")
    void calculatingDiscountWithOverDiscount() {
        assertThatThrownBy(() ->{Calculator.calculatingDiscount(500, 999);}).isInstanceOf(ArithmeticException.class);
    }
}