package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturn900IfAmountIs100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 100;

        int actual = service.remain(amount);
        int expected = 900; // До 1000 не хватает 900

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn1000IfAmountIsMultipleOf1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 1000; // Докупите ещё на 1000 рублей

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100; // До 1000 не хватает 100

        assertEquals(expected, actual);
    }
}