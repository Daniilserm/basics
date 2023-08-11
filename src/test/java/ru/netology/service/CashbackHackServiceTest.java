package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldBuy900Return100() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldBuy1000Return0() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldBuy999Return1() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldBuy10kReturn990() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(10);
        int expected = 990;

        assertEquals(actual, expected);
    }
}