package org.example.orders;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.ValidatableResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class OrderCreateTest {
    private OrderSteps orderSteps;
    private OrderCreate orderCreate;
    private OrderResult orderResult;

    @Before
    public void setUp() {
        orderSteps = new OrderSteps();
        orderResult = new OrderResult();
    }

    @Test
    @DisplayName("Создание заказа с самокатами разных цветов")
    @Description("Цвет самоката - BLACK, GREY")
    public void orderCreateColorBlackAndGrey(){
        orderCreate = new OrderCreate((Arrays.asList("BLACK", "GREY")));
        ValidatableResponse validatableResponse = orderSteps.orderCreate(orderCreate);
        orderResult.orderResultCreate(validatableResponse);
    }

    @Test
    @DisplayName("Создание заказа с самокатами разных цветов")
    @Description("Цвет самоката - BLACK")
    public void orderCreateColorBlack(){
        orderCreate = new OrderCreate((Arrays.asList("BLACK")));
        ValidatableResponse validatableResponse = orderSteps.orderCreate(orderCreate);
        orderResult.orderResultCreate(validatableResponse);
    }

    @Test
    @DisplayName("Создание заказа с самокатами разных цветов")
    @Description("Цвет самоката - GREY")
    public void orderCreateColorGrey(){
        orderCreate = new OrderCreate((Arrays.asList("GREY")));
        ValidatableResponse validatableResponse = orderSteps.orderCreate(orderCreate);
        orderResult.orderResultCreate(validatableResponse);
    }

    @Test
    @DisplayName("Создание заказа с самокатами разных цветов")
    @Description("Цвет самоката - не указан")
    public void orderCreateNoColor(){
        orderCreate = new OrderCreate((Arrays.asList()));
        ValidatableResponse validatableResponse = orderSteps.orderCreate(orderCreate);
        orderResult.orderResultCreate(validatableResponse);
    }
}
