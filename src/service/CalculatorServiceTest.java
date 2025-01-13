package com.example.testingl.service;

import com.example.testingl.exception.DivideByZeroException;
import org.jetbrains.annotations.TestOnly;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

private final CalculatorService calculatorService = new CalculatorService();


@Test
void plus() {
// given
    Integer num1 = 8;
    Integer num2 = 2;
    Integer expectedResult = 10;

    Integer num3 = 100;
    Integer num4 = 100;
    Integer expectedResult = 200;
// when
    Integer actualResult = calculatorService.plus(num1, num2);
    Integer actualResult = calculatorService.plus(num3, num4);
// then
    Assertions.assertEquals(expectedResult, actualResult);
    Assertions.assertEquals(expectedResult2, actualResult2);
}
@Test
void minus() {
//given
    Integer num1 = 8;
    Integer num2 = 2;
    Integer expectedResult = 6;
    Integer num3 = 6;
    Integer num4 = 2;
    Integer expectedResult = 4;
// when
    Integer actualResult = calculatorService.minus(num1, num2);
    Integer actualResult = calculatorService.minus(num3, num4);
// then
    Assertions.assertEquals(expectedResult, actualResult);
    Assertions.assertEquals(expectedResult2, actualResult2);
}
    @Test
    void myltyply() {
//given
        Integer num1 = 8;
        Integer num2 = 2;
        Integer expectedResult = 16;
        Integer num3 = 6;
        Integer num4 = 2;
        Integer expectedResult = 12;
// when
        Integer actualResult = calculatorService.myltyply(num1, num2);
        Integer actualResult = calculatorService.myltyply(num3, num4);
// then
        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertEquals(expectedResult2, actualResult2);
    }
    @Test
    void divide() {
//given
        Integer num1 = 8;
        Integer num2 = 2;
        Integer expectedResult = 4;
        Integer num3 = 6;
        Integer num4 = 2;
        Integer expectedResult = 3;
// when
        Integer actualResult = calculatorService.divide(num1, num2);
        Integer actualResult = calculatorService.divide(num3, num4);
// then
        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertEquals(expectedResult2, actualResult2);
    }

    @Test
    void shouldThrowExceptionWhenNum2IsZero() {
//given
        Integer num1 = 8;
        Integer num2 = 0;
// when
// then
        Assertions.assertThraws(DivideByZeroException.class, () -> calculatorService.divide(num1, num2));
    }
}

