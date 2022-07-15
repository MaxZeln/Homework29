package ru.learnup.learnup.spring.mvc.homework29.model;

import lombok.Builder;
import lombok.Data;

import ru.learnup.learnup.spring.mvc.homework29.entity.User;

import java.util.List;

@Data
@Builder
public class OrderDto {

    private int id;
    private int purchase_amount;
    private UserDto user;
    private OrderDetailsDto order_detail;

}
