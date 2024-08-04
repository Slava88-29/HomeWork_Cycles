package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @Test
    void shouldCalculateCorrect() {
        Service service = new Service();

        // подготавливаем данные:
        long income = 10000;
        long expenses = 3000;
        long threshold = 20000;
        int expected = 3;
        // вызываем целевой метод:
        long actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateCorrect2() {
        Service service = new Service();

        // подготавливаем данные:
        long income = 100000;
        long expenses = 60000;
        long threshold = 150000;
        int expected = 2;
        // вызываем целевой метод:
        long actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }

}