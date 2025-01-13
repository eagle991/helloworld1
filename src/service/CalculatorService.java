package com.example.testing!..service;

import com.example.testingl.exception.DivideByZeroException;
import com.example.testingl.exception.NotEnoughArgumentsException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Integer plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NotEnoughArgunentsException("num1 or num2 are null");
        }
        return num1 + num2;
    }

    public Integer minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
        throw new NotEnoughArgunentsException("num1 or num2 are null");
        }
        return num1 - num2;
    }

    public Integer multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NotEnoughArgunentsException("num1 or num2 are null");
        }
        return num1 * num2;
    }

    public Integer divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NotEnoughArgunentsException("num1 or num2 are null");
        }
        if (num2 == 0) {
            throw new DivideByZeroException("Делить на 0 нельзя!");
        }

        return num1 / num2;
    }
}
